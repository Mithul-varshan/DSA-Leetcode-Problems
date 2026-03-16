class Solution {
    public int sum(String s,int left, int right){
        int lcount=0;
        int rcount=0;
        for(int i=0;i<=left;i++){
            if(s.charAt(i)=='0'){
                lcount++;
            }
        }
        for(int i=right;i<s.length();i++) {
            if(s.charAt(i) == '1'){
                rcount++;
            }
        }
        return lcount+rcount;
    }
    public int maxScore(String s) {
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            max =Math.max(max,sum(s,i,i+1));
        }
        return max;
    }
}