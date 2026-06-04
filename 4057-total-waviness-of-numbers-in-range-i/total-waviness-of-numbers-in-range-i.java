class Solution {
    public int totalWaviness(int num1, int num2) {
        int wav = 0;
        for(int i=num1;i<=num2;i++){
            String s = String.valueOf(i);
            for(int j=1;j<s.length()-1;j++){
                int n = (int)s.charAt(j);
                int nPrev = (int)s.charAt(j-1);
                int nNext = (int)s.charAt(j+1);
                if((n > nPrev && n> nNext) || (n < nPrev && n < nNext)){
                    wav++;
                }
            }
        }
        return wav;
    }
}