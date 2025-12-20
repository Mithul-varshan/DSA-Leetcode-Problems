class Solution {
    public int minDeletionSize(String[] strs) {
        int delete = 0;
        int count = 0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<strs.length-1;j++){
                if((int)strs[j].charAt(i) <= (int)strs[j+1].charAt(i)){
                    count++;
                }
            }
            if(count != strs.length-1){
                delete++;
            }
            count=0;

        }
        return delete;
    }
}