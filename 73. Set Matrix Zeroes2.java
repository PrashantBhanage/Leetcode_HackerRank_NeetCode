class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        boolean[][] isZero = new boolean[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j< c; j++){
                if(matrix[i][j] == 0){
                    isZero[i][j] = true;
                }
            }
        }

        for(int i = 0; i< r; i++){
            for(int j = 0; j<c; j++){
                if(isZero[i][j]){
                    wipeRowAndCol(matrix,i,j,r,c);
                }
            }
        }
    }

    public void wipeRowAndCol(int[][] matrix, int currentRow, int currentCol, int totalRows, int totalCols){
        for(int j = 0; j<totalCols; j++){
            matrix[currentRow][j] = 0;
        }

        for(int i = 0; i<totalRows; i++){
            matrix[i][currentCol] = 0;
        }
    }
}
