class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() ==1) return "0";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && st.peek() > ch && k!=0){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(!st.isEmpty() && k-->0){
            st.pop();
        }
        // System.out.print(st.size());
        String s ="";
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pop());
        }
        String rev = sb.reverse().toString();
        int c=0;
        for(int i=0; i<rev.length();i++){
            char ch = rev.charAt(i);
            if(ch == '0'){
                c++;
            }
            else break;
        }
        return rev.substring(c).length() > 0 ? rev.substring(c) : "0" ;
    }
}