class Solution {
    static int[] dp = new int[46];
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = climbStairs(n-1) + climbStairs(n-2);
    }
}

        //using recursion  - TLE occures so go for DP
        // if(n==1 || n==2) return n;
        // return climbStairs(n-1) + climbStairs(n-2);
    