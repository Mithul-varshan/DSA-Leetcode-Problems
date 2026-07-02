class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int sl = s.length();
        int tl = t.length();
        int idx;
        if(sl == tl){
            for (int i =0;i<sl;i++){
                idx = s.charAt(i) -'a';
                arr[idx]++;
            }
            for (int i=0; i<tl ; i++){
                idx = t.charAt(i) - 'a';
                arr[idx]--;
            }
            for(int i = 0; i<26;i++){
                if(arr[i]!=0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}