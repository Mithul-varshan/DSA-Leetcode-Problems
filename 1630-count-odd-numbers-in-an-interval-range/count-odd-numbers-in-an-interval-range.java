class Solution {
    public int countOdds(int low, int high) {
        // int c=0;
        // if (low %2 != 0){
        //     for(int i = low; i<= high; i+=2){
        //             c++;
        //     }
        // }
        // if (low %2 == 0){
        //     for(int i = low+1 ; i<=high ; i+=2){
        //         c++;
        //     }
        // }
        // return c;
        if (low % 2 != 0) {
            low -= 1;
        }
        if (high % 2 != 0) {
            high += 1;
        }
        return (high - low) / 2;
    
    }
}