class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        Arrays.sort(capacity);
        int current = 0;
        int boxes = 0;
        for(int i : apple){
            sum += i;
        }
        for(int i=capacity.length-1;i>=0;i--){
            current+=capacity[i];
            boxes++;
            if(current >= sum){
                return boxes;
            }
        }
        return boxes;

    }
}