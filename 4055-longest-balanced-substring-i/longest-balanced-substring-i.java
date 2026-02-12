// class Solution {
//     public int check(String s, int start, int end){
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=start;i<=end;i++){
//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
//         }
//         int count=0;
//         int freq = -1;
//         for(int value : map.values()){
//             if(freq == -1){
//                 freq = value;
//             }
//             else if(freq != value){
//                 return 0;   
//             }
//         }
//         return end - start + 1;
//     }     
//     public int longestBalanced(String s) {
//         int max =0;
//         for(int i=0;i<s.length();i++){
//             for(int j =i;j<s.length();j++){
//                 int count = check(s,i,j);
//                 max = Math.max(max,count);
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public boolean isBalanced(HashMap<Character,Integer> map){
        int freq = -1;
        for(int value : map.values()){
            if(freq == -1){
                freq = value;
            } else if(freq != value){
                return false;
            }
        }
        return true;
    }    
    public int longestBalanced(String s) {
        int max =0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j =i;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j), 0) + 1);
                if(isBalanced(map)){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}