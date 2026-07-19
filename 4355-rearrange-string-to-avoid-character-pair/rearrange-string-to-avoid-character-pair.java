class Solution {
    public String rearrangeString(String s, char x, char y) {
        String st = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == y) st+=String.valueOf(ch);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != y) st+=String.valueOf(ch);
        }
        return st;
    }
}