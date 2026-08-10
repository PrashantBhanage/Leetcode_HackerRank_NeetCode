Row with Max 1s in Rowwise Sorted
Solved
Difficulty: MediumAccuracy: 33.09%Submissions: 453K+Points: 4
You are given a 2D binary array arr[][] consisting of only 1s and 0s. Each row of the array is sorted in non-decreasing order. Your task is to find and return the index of the first row that contains the maximum number of 1s. If no such row exists, return -1.

Note:

The array follows 0-based indexing.
The number of rows and columns in the array are denoted by n.

class Solution {
    public int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        if (n == 0) return -1;
        
        int maxRowIndex = -1;
        int maxOnesCount = 0;

        for (int i = 0; i < n; i++) {
            int countOfOnes = countOnesInRow(arr[i]);
            if (countOfOnes > maxOnesCount) {
                maxOnesCount = countOfOnes;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }

    private int countOnesInRow(int[] row) {
        int low = 0, high = row.length - 1;
        int firstIndex = row.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1) {
                firstIndex = mid;
                high = mid - 1; // Look for an earlier '1' on the left
            } else {
                low = mid + 1; // Look on the right
            }
        }
        return row.length - firstIndex;
    }
}
