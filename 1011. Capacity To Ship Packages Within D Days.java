class Solution {

    public int shipWithinDays(int[] weights, int days) {

        // Minimum possible capacity = heaviest package
        int low = 0;

        // Maximum possible capacity = sum of all packages
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        // Binary Search on the answer (capacity)
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, mid, days)) {
                high = mid - 1; // Try a smaller capacity
            } else {
                low = mid + 1; // Capacity is too small
            }
        }

        return low;
    }

    // Checks whether all packages can be shipped within 'days'
    private boolean canShip(int[] weights, int capacity, int days) {

        int daysUsed = 1;
        int currentLoad = 0;

        for (int weight : weights) {

            // If the current package fits, load it
            if (currentLoad + weight <= capacity) {
                currentLoad += weight;
            } 
            // Otherwise, use a new day
            else {
                daysUsed++;
                currentLoad = weight;
            }
        }

        return daysUsed <= days;
    }
}
