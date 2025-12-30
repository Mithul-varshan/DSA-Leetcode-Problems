class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] newS = s.toCharArray();
        char[] newT = t.toCharArray();
        Arrays.sort(newS);
        Arrays.sort(newT);
        String sortedS = new String(newS);
        String sortedT = new String(newT);
        int count=0;
        for(int i=0;i<sortedS.length();i++){
            if(sortedS.charAt(i) == sortedT.charAt(i)) count++;
        }
        if(count == sortedS.length()){
          return true;  
        }
        else{
            return false;
        } 
    }
}