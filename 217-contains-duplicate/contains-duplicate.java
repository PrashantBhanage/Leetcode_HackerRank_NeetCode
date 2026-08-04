class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> seen = new HashSet<>();
        int n = nums.length;
       

        for(int i = 0; i<n; i++){
            if(seen.contains(nums[i])){
                return true;
            }
                seen.add(nums[i]);
            }

        return false;
    }
}