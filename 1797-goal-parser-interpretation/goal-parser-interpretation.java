class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i) != '(' && command.charAt(i) != ')' ){
                s.append(command.charAt(i));
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                s.append('o');
            }
        }
        return s.toString();
    }
}