class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        int GCD = 1;
        for(int i=1;i<=n+n;i++){
            if(i%2 == 0) evenSum+=i;
            else oddSum+=i;
        }
        if(evenSum < oddSum){
            for(int i=1;i<=evenSum;i++){
                if(evenSum%i==0 && oddSum%i==0){
                    if(i > GCD) GCD = i;
                }
            }
        }
        else if(oddSum < evenSum){
            for(int i=1;i<=oddSum;i++){
                if(evenSum%i==0 && oddSum%i==0){
                    if(i > GCD) GCD = i;
                }
            }
        }
        return GCD;
    }
}