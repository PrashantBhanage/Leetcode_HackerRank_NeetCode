class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> ans = new HashSet<>();

for (int i = 0; i < n; i++) {

    HashSet<Integer> seen = new HashSet<>();

    for (int j = i + 1; j < n; j++) {

        int third = -(nums[i] + nums[j]);

        if (seen.contains(third)) {

            List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
            Collections.sort(triplet);
            ans.add(triplet);
        }

        seen.add(nums[j]);
    }
}

return new ArrayList<>(ans);
    }
}