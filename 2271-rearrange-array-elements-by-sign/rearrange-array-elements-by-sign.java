class Solution {
    public int[] rearrangeArray(int[] nums) {
        //so im gonna create an array to store these values.
        //and create an for loop from 0th index to n
        // if the current no. is postive set that in 0th index and its next index value must be negative like this one positive nad next one is negative 


        int[] result = new int[nums.length];

        int pos = 0;// Positives go to even indices (0, 2, 4, ...)
        int neg = 1;// Negatives go to odd indices (1, 3, 5, ...)

        for(int num : nums){
            if(num>0){
                result[pos] = num;
                pos +=2;// Jump to the next even spot
            }else{
                result[neg] = num;
                neg +=2;// Jump to the next odd spot
            }
        } 
        return result;
    }
}