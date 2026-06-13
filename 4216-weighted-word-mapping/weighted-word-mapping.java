class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char c = 'a';
        String ans = "";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0;i<weights.length;i++) {
            map.put(c++, weights[i]);
        }

        for (int i=0;i<words.length;i++) {
            int sum = 0;
            String s = words[i];

            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                sum += map.get(ch);
            }

            sum = sum % 26;

            ans += (char)('z' - sum);
        }

        return ans;
    }
}