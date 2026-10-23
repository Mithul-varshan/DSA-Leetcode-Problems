class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum=0;
        int rSum=0;
        int lMax=0;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
            lMax = lSum;
        }
        int rIndex = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lSum = lSum - cardPoints[i];
            rSum = rSum + cardPoints[rIndex--];
            lMax = Math.max(lMax,lSum+rSum);
        }
        return lMax;

    }       
}
