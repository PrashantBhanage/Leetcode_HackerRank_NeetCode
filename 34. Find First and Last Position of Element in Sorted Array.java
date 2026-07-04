Revision

  class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int f = -1;
        int last = -1;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(nums[mid] == target){
                f = mid;
                r = mid-1;
            } else if(nums[mid]<target){
                l  = mid+1;
            }else{
                r = mid-1;
            }
        }
       l = 0;
       r = nums.length-1;

       while(l<=r){
        int mid = l+(r-l)/2;

        if(nums[mid] == target){
            last = mid;
            l = mid+1;
        }else if(nums[mid]<target){
            l = mid+1;
        }else{
            r = mid-1;
        }
       }
       return new int[]{f,last};
    }
}





Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
