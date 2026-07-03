class Solution {
    public int romanToInt(String s) {
        int prev = 0;
        int sum = 0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int a = 0;
            switch(ch){
                case 'I':
                    a=1;
                    break;
                case 'V':
                    a=5;
                    break;
                case 'X':
                    a=10;
                    break;
                case 'L':
                    a=50;
                    break;
                case 'C':
                    a=100;
                    break;
                case 'D':
                    a=500;
                    break;
                case 'M':
                    a=1000;
                    break;
            }
            if(a < prev) sum-=a;
            else sum+=a;
            prev=a;
        }
        return sum;
    }
}