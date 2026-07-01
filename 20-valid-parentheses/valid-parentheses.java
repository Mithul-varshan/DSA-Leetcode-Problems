class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        if(s.length() == 1) return false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') open.push(ch);
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(open.isEmpty()) return false;
                char top = open.pop();

                if ((top == '(' && ch != ')') ||
                    (top == '[' && ch != ']') ||
                    (top == '{' && ch != '}')) {
                    return false;
                }
            }         
        }            
        return open.isEmpty();
    }
}