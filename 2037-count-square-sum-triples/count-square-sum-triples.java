class Solution {
    public int countTriples(int n) {
        //  3^2 + 4^2 = 5^2
        //  n < [2,4,5]
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                double sum = Math.sqrt(i*i + j*j);
                if ((int)sum == sum && sum <= n) {
                    count++;
                }
            }

        }
        return count;
    }
}