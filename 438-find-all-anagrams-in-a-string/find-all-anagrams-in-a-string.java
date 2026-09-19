class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        ArrayList<Integer> l = new ArrayList<>();

        StringBuilder temp = new StringBuilder();
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String sortedP = new String(pArr);

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            temp.append(ch);
            if(temp.length() == p.length()){
                char[] tempArr = temp.toString().toCharArray();
                Arrays.sort(tempArr);
                String sortedTemp = new String(tempArr);
                if(sortedTemp.equals(sortedP)) l.add(left);
                temp.deleteCharAt(0);
                left++;
            }
        }
        return l;
    }
}