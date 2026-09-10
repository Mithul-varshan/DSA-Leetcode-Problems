class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sumOfSqr(n);
        while(slow != fast) {
            slow = sumOfSqr(slow);
            fast = sumOfSqr(sumOfSqr(fast));
        }
        return fast == 1;
    }
    public int sumOfSqr(int n){
        int sum=0;
        while(n != 0){
            int digit = n%10;
            sum+=(digit*digit);
            n=n/10;
        }
        return sum;
    }
}