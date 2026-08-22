class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod = 1;
        int temp = n;
        while(n!=0){
            int last = n % 10;//23
            sum+=last;
            prod*=last;
            n=n/10;
        }
        if(temp%(sum+prod) == 0) return true;
        return false;
        // return n%(sum+prod) == 0 ? true : false;
    }
}