class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int n = 123456789;
        List<Integer> l = new ArrayList<>();
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                String c = "";
                for(int k=i; k<=j; k++){
                    c+=s.charAt(k);
                }
                int ans = 0;
                if(c.length() >= 1){
                    ans = Integer.valueOf(c);
                }
                if(ans >= low && ans <= high){
                    l.add(ans);
                }
            }
        }
        Collections.sort(l);
        return l;
    }
}

