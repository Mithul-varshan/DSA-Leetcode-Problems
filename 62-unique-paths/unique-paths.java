class Solution {
    //simple recursion

    // public int solve(int i, int j, int m, int n){
    //     //Failure case
    //     if(i==m || j==n) return 0;
    //     //Success case
    //     if(i == m-1 && j == n-1) return 1;
    //     //keep moving right and down
    //     return solve(i,j+1,m,n) + solve(i+1,j,m,n);
    // } 
    // public int uniquePaths(int m, int n) {
    //     return solve(0,0,m,n);
    // }

    //using DP
    int up(int i, int j, int m, int n, int[][]dp){
        if(i == m || j == n) return 0; //failure
        if(i == m - 1 || j == n - 1) return 1; //success
        if(dp[i][j] != -1) //checking already calculated or not
            return dp[i][j];
        return dp[i][j] = up(i+1,j,m,n,dp) + up(i,j+1,m,n,dp);
    }
    public int uniquePaths(int m, int n){
        int[][] dp = new int[m][n]; // to store calculated ans
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }
        return up(0,0,m,n,dp);
    }
}