class LargestElement {
    public int largestElement(int[] nums) {
    int l = 0; 
    int r = nums.length-1;

    while(l<r){
        int mid = l+(r-l)/2;

        if(nums[mid]>nums[r]){
            l = mid+1;
        }else{
            r = mid;
        }
    }
    int maxIndex = (l == 0) ? nums.length - 1 : l - 1;
        return nums[maxIndex];
    }

public static void main(String[] args) {
    // 1. Create an instance of your class
    LargestElement solution = new LargestElement();
    
    // 2. Create a test array
    int[] testArray = {4, 5, 6, 7, 0, 1, 2}; 
    
    // 3. Call your method and print the result
    int result = solution.largestElement(testArray);
    System.out.println("The result is: " + result);
}
}