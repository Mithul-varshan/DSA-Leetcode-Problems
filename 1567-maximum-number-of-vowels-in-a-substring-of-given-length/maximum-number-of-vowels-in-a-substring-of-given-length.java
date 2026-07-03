class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if("AEIOUaeiou".indexOf(ch) != -1) count++;
        }
        int ans = count;
        for(int i=k;i<s.length();i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i-k);
            if("AEIOUaeiou".indexOf(ch) != -1) count++;
            if("AEIOUaeiou".indexOf(ch2) != -1) count--;
            ans = Math.max(ans,count);
        }
        return ans;
    }
}