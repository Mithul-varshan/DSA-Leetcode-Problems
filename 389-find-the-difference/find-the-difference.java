class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char chars : s.toCharArray()) c^=chars; //if we do this -->  c = c ^ chars java implicitly converts to int after ^ operation so error occurs
        for(char chart : t.toCharArray()) c^=chart; 
        return c;
    }
}