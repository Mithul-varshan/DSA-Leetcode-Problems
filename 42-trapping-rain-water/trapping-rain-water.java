class Solution {
    public int trap(int[] height) {
        // int lgh=0;
        // int rgh=0;
        // int res=0;
        // int n = height.length;
        // for(int i=0;i<n;i++){

        //     lgh = height[i];
        //     for(int j=i-1;j>=0;j--){
        //         if(height[j] > lgh) lgh = height[j];
        //     }
            
        //     rgh = height[i];
        //     for(int j=i+1;j<n;j++){
        //         if(height[j] > rgh) rgh = height[j];
        //     }

        //     res = res + Math.min(lgh,rgh) - height[i];
        // }
        // return res;

        int n = height.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return res;

        //next should be done in two pointers
    }
}