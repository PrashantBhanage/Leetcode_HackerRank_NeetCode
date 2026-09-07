class Solution {
    public int[] sortArray(int[] nums) {
        //int i;
        //int j;
       // int temp;
       // int swapped;
       for(int i = 0; i<nums.length-1; i++){
        for(int j = 0; j<nums.length-i-1; j++){
            if(nums[j] > nums[j+1]){
               int temp = nums[j];
                nums[j]= nums[j+1];
                nums[j+1] = temp;
                //swapped = 1; 
            }
        }
        //if(swapped == 0){
          //  break;
        }
        
        //System.out.println("Sorted array");
        //for(int i = 0; i<nums.length; i++);
       return nums;
}
       }
