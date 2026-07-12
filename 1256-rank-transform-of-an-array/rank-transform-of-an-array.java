class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] narr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            narr[i] = arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int j=1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i]))
            {   map.put(arr[i],j);
                j++;
            }
        }
        for(int i=0;i<narr.length;i++){
            narr[i] = map.get(narr[i]);
        }
        return narr;
    }
}