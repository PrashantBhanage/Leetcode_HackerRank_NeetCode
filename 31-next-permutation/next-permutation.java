class Solution {
    public void nextPermutation(int[] nums) {
        // We need an index to track our position, starting second from the right
        int i = nums.length - 2;

        // 1. FIND THE DIP (You were trying to do this with 'num < nums+1')
        // We walk backward until we find a number smaller than the one to its right.
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--; 
        }
        
        // If i is >= 0, it means we actually found a dip (it's not completely reverse sorted)
        if (i >= 0) {
            int j = nums.length - 1;
            
            // 2. FIND THE TARGET (You were trying to do this with 'num > nums')
            // Walk backward again to find the first number bigger than our dip
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            
            // 3. SWAP the dip and the target
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // 4. REVERSE (You tried 'reverse.nextPermutation()')
        // We have to write a quick loop to reverse the rest of the array manually
        int left = i + 1;
        int right = nums.length - 1;
        
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}