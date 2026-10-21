class Solution {
    public int shortestSequence(int[] rolls, int k) {
        Set<Integer> s = new HashSet<>();
        int c = 0 ;
        
        for(int i = 0 ;i<rolls.length;i++){
            s.add(rolls[i]);
            if(s.size()==k){ 
            c++;
            s.clear();
            }
        }
        return c+1;
    }
}