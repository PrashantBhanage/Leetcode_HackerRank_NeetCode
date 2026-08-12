class Solution {
    public List<List<Integer>> generate(int numRows) {
        

        //create the triangle first

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);

            ///The middle exist only when i>1
            //SO we need to look at prev rows
            if(i>1){
                List<Integer> prevrow = triangle.get(i-1);//Gives the previous row and store it in prevrow."
                for(int j = 1;j<i; j++){
                    /*
                    For:

                    previousRow = [1, 3, 3, 1]

                    When j = 1:

                    previousRow[0] + previousRow[1]
                    = 1 + 3
                    = 4

                    When j = 2:

                    previousRow[1] + previousRow[2]
                    = 3 + 3
                    = 6

                    When j = 3:

                    previousRow[2] + previousRow[3]
                    = 3 + 1
                    = 4 
                    */

                    int value= prevrow.get(j-1)+prevrow.get(j);
                    row.add(value);
                }
            }
        if(i>0){//If this isn't the first row, add the ending 1.
            row.add(1);
        }
        triangle.add(row);
        }
        return  triangle;
    }
}