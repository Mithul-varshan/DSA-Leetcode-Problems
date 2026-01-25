import java.util.Map;
import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int start = 0;
        // int maxLen = 0;
        // Map<Character,Integer> seen = new HashMap<>();
        // for(int end =0;end<s.length();end++){
        //     char ch = s.charAt(end);
        //     seen.put(ch,seen.getOrDefault(ch,0)+1);

        //     while(seen.get(ch) > 1){
        //         char startChar = s.charAt(start);
        //         seen.put(startChar,seen.get(startChar)-1);
        //         start++;
        //     }
        //     maxLen = Math.max(maxLen,end - start + 1);
        // }
        // return maxLen;
        
        //BRUTE FORCE
        // int maxLen =0;
        // for(int i=0;i<s.length();i++){
        //     int[] n = new int[256] ;
        //     int len =0;
        //     for(int j=i;j<s.length();j++){
        //         if(n[s.charAt(j)] == 1) break;
        //         len = j-i+1;
        //         maxLen = Math.max(maxLen,len);
        //         n[s.charAt(j)] = 1;
        //     }
        // }
        // return maxLen;    

        //Sliding window

        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int n = s.length();
        int maxLen =0;
        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch) + 1;
            }
            map.put(ch,right);
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
