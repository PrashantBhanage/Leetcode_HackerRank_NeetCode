class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;

        HashMap<Integer, Integer> seen = new HashMap<>();


        for(int i = 0; i<nums.length; i++){
           
                int sum = target - nums[i];
                if(seen.containsKey(sum)){
                    return new int[]{seen.get(sum), i};
                }
                seen.put(nums[i], i);
            }
            return new int[]{};
        
    }
}