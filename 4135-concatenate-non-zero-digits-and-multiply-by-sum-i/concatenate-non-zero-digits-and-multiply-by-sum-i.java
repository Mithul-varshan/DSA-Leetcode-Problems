class Solution {
    public long sumAndMultiply(int n) {
        long newDigit =0;
        long sum =0;
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '0'){
                int digit = Integer.parseInt(String.valueOf(ch));
                newDigit = (newDigit * 10) + digit;
                sum+=digit;
            }
        }
        // System.out.println(newDigit);
        // System.out.println(sum);
        return newDigit*sum;
    }
}