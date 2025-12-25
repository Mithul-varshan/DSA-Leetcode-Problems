class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        int n = happiness.length-1;
        for(int i=0;i<k;i++){
            int value = happiness[n-i] - i;
            if(value <= 0) break;
            sum += value;
        }
        return sum;
    }
}