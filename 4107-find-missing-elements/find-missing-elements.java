class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
            if(num > max) max = num;
            if(num < min) min = num;
        }
        for(int i=min;i<=max;i++){
            if(!s.contains(i)) l.add(i);
        }
        return l;
    }
}