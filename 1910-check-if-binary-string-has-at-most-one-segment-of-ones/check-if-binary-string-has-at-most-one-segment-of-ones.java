class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length() == 1 || s.length() == 2){
            return true;
        }
        for(int i=0;i<s.length();i++){
           if(i != 0){
                if(s.charAt(i) == '1' && s.charAt(i-1) == '0'){
                    return false;
                }
           }
        }
        return true;
    }
}