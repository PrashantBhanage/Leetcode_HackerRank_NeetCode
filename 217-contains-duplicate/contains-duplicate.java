class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> seen = new HashSet<>();
        int n = nums.length;
        int l = 0;

        for(int i = 0; i<n; i++){
            if(seen.contains(nums[i])){
                return true;
            }
                seen.add(nums[i]);
            }

        return false;
    }
}