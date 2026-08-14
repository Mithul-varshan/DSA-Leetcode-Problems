class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                int count=0;
                StringBuilder sb = new StringBuilder();
                HashMap<Character,Integer> map = new HashMap<>();
                for(int k=i;k<=j;k++){
                    sb.append(s.charAt(k));
                }
                for(int k=0;k<sb.length();k++){
                    char ch = sb.charAt(k);
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }

                for(char c : map.keySet()){
                    if(map.get(c) <= 2) count+=map.get(c);
                }
                if(count == sb.length()){
                    if(count > max) max = count;
                }
                map = new HashMap<>();
                sb.delete(0,sb.length());
            }
        }
        return max;
    }
}