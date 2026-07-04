class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row*col;i++){
            int r = i/col;
            int c = i%col;
            if(matrix[r][c] == target) return true;
        }
        return false;
    }
}