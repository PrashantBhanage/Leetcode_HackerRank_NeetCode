class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] result = new int[k];
        int index = 0;

        // Find top k
        for (int j = 0; j < k; j++) {

            int maxFrequency = 0;
            int maxNumber = 0;

            for (int number : map.keySet()) {

                if (map.get(number) > maxFrequency) {
                    maxFrequency = map.get(number);
                    maxNumber = number;
                }
            }

            result[index] = maxNumber;
            index++;

            map.remove(maxNumber);
        }

        return result;
    }
}