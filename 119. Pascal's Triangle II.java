class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1); //stores result

        long prev = 1; //previous number

        for(int k = 1; k<=rowIndex; k++){
            long next_val = prev * (rowIndex - k + 1) / k;
            result.add((int) next_val);
            prev  = next_val;
        }
        return result;
    }
}
//for (int k = 1; k <= rowIndex; k++)

//because the first element (k = 0) is always 1, and it's already added here:

//res.add(1);
