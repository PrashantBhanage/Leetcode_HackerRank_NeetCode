class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroRows = new HashSet<>();

        HashSet<Integer> zeroCol = new HashSet<>();

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeroRows.add(i);

                    zeroCol.add(j);
                }
            }
        }

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(zeroRows.contains(i) || zeroCol.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}