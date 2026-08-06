class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<a.length;i++){
            boolean destroyed = false;
            while(!st.isEmpty() && st.peek() > 0 && a[i] < 0){
                if(st.peek() < -a[i]){
                    st.pop();
                }
                else if(st.peek() == -a[i]){
                    st.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed) st.push(a[i]);
        }
        int[] res = new int[st.size()];
        for(int i=0;i<st.size();i++){
            res[i] = st.get(i);
        }
        return res;
    }
}
