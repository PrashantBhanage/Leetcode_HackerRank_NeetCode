Revision

  class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int mid = l+ (r-l)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                l = mid+1;
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

            }else{
                r = mid-1;
            }
        }
        return l;
    }
}



