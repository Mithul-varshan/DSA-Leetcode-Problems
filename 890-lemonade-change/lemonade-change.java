class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten =0;
        int five =0;
        for(int i=0;i<bills.length;i++){
            int given = bills[i];
            if(given == 5) five++;
            else if(given == 10) {
                if(five > 0){
                    five--;
                    ten++;
                }
                else return false;
            }
            else{
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }
                else if(five >= 3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}