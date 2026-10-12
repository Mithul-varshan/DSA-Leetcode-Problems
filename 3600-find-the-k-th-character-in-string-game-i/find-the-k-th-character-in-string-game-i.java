class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        while(s.length() < k){
            String s2 = "";
            for(int i=0;i<s.length();i++){
                s2+=String.valueOf((char)(s.charAt(i) + 1));
            }
            s+=s2;
        }
        return s.charAt(k-1);
    }
}