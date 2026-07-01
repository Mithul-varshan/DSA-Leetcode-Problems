class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int n = temperatures.length;
        // int[] res = new int[n];
        // for(int i=0;i<n;i++){
        //     res[i]=0;
        //     for(int j=i+1;j<n;j++){
        //         if(temperatures[j] > temperatures[i]){
        //             res[i] = j-i;
        //             break;
        //         }
        //     }
        // }
        // return res;

        int n = temperatures.length;
        int [] answer = new int[n];
        Stack <Integer> s = new Stack();
        for (int currDay=0;currDay <n;currDay++){
            int currentTemp = temperatures[currDay];
            //pop until the current day's temp is not
            //warmer than the temperature ar the top of the stack
            while (!s.isEmpty() && temperatures[s.peek()]< currentTemp){
                int prevDay = s.pop();
                answer[prevDay] = currDay - prevDay;
            }
            s.push(currDay);
        }
        return answer;
    }
}