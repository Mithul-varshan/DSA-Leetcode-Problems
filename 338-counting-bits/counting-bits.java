// class Solution {
//     public int[] countBits(int n) {
//         int[] arr = new int[n+1];
//         int index=0;
//         for(int i=0;i<=n;i++){
//             String s = Integer.toBinaryString(i);
//             int count=0;
//             for(int j=0;j<s.length();j++){
//                 char c = s.charAt(j);
//                 if(c == '1') count++;
//             }
//             arr[index] = count;
//             index++;
//         }
//         return arr;
//     }
// }
class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = arr[i>>1] + (i&1); 
        }
        return arr;
    }
}