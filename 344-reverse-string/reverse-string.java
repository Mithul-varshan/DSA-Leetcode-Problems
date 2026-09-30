class Solution {
    public void reverse(char[] s, int l, int r){
        if(l>=r) return;
        char temp = s[r];
        s[r] = s[l];
        s[l] = temp;
        l++;
        r--;
        reverse(s,l,r);
    }    
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
}