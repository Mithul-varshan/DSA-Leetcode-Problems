class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n'){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }
        int min = Integer.MAX_VALUE;
        if (!map.containsKey('b') || !map.containsKey('a') ||
            !map.containsKey('l') || !map.containsKey('o') ||
            !map.containsKey('n')) {
            return 0;
        }
        map.put('o', map.get('o')/2);
        map.put('l', map.get('l')/2);
        for(Character c: map.keySet()){
            if(map.get(c) < min){
                min = map.get(c);
            }
        }
        return min;
    }
}