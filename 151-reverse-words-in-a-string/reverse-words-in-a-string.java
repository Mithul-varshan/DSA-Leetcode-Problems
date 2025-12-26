class Solution {
    public String reverseWords(String s) {
        ArrayList<String> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            else if(sb.length() > 0){
                l.add(sb.toString());
                sb= new StringBuilder();
            }
        }
        if(sb.length() > 0){
            l.add(sb.toString());
        }
        sb = new StringBuilder();
        for(int i =l.size()-1; i>=0; i-- ){
            sb.append(l.get(i));
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }
}