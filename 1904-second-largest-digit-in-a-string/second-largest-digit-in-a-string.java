class Solution {
    public int secondHighest(String s) {
        int ans =0;
        ArrayList<Integer> arr = new ArrayList();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( (c >= 65 && c<=90) || (c>=97 && c<= 122) ) continue;
            else{
                int n = Integer.parseInt(String.valueOf(c));
                if(n > ans) ans = n;
                arr.add(n);
            }
        }
        for(int i=0;i<arr.size();){
            if(arr.get(i) == ans) arr.remove(i);
            else i++;
        }
        if(arr.size() == 0) return -1;

        int ans2=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) > ans2) ans2 = arr.get(i);
        }
        return ans2;
    }
}