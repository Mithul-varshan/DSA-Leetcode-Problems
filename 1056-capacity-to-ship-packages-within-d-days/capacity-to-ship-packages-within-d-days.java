class Solution {
    public static int days(int[] weights, int capacity){
        int days = 1;
        int currentLoad = 0;
        for(int w : weights){
            if(currentLoad + w > capacity){
                currentLoad = w;
                days++;
            }
            else{
                currentLoad += w;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while(left < right){
            int mid = left + (right - left) / 2;
            int needed = days(weights,mid);
            if(needed <= days){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
