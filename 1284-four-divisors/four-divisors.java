class Solution {
    public int checkDivisor(int num){
        int divisorCount=0;
        int sum=0;
        for(int i=1 ; i<=num ; i++){
            if (num % i == 0){
                divisorCount++;
                if(divisorCount <= 4){
                    sum += i;
                }
                else{
                    break;
                }
            }
        }
        if(divisorCount == 4){
            return sum;
        }
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int  sum =0;
        for(int n : nums){
            int ans = checkDivisor(n);
            sum+=ans;
        }
        return sum;
    }
}