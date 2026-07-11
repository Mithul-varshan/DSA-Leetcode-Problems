class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max =0;
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            if(map.containsKey(ch) && map.get(ch) >= l){
                l = map.get(ch)+1;
            }
            map.put(ch,r);
            max = Math.max(max, r - l+1);
        }
        return max;
    }
}