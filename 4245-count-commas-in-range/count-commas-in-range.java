class Solution {
    public int countCommas(int n) {
        if(n <= 999) return 0;
        int count=0;
        for(int i=1000;i<=n;i++) {
            if(i >= 1000) count++;
            if(i >= 1000000) count++;
            // if(i >= 1000000000) count++;
        }
        return count;
    }
}