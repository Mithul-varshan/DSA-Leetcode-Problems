class Solution {
    public String getHint(String s, String s2) {
        int x=0;
		int y=0;
        HashSet<Integer> h = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch == ch2){
                x++;
            }
            else{
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch = s.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch != ch2){
                if(map.getOrDefault(ch2,0) > 0){
                    y++;
                    map.put(ch2,map.get(ch2)-1);
                }
            }
        }
        return x + "A" + y + "B";
    }
}