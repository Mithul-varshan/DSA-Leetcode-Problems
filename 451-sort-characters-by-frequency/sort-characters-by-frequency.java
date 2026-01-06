class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(m.entrySet());
        Collections.sort(list, (e1, e2) -> {
            if(!e1.getValue().equals(e2.getValue())){
                return e2.getValue() - e1.getValue();
            }
            return e1.getKey() - e2.getKey();
        });

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list){
            char key = entry.getKey();
            int count = entry.getValue();
            for(int i=0;i<count;i++){
                result.append(key);
            }
        }
        return result.toString();
    }
}