Example 1.
  nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Imagine trying different continuous subarrays:

Subarray	Sum
[-2]	-2
[1]	1
[4]	4
[4, -1]	3
[4, -1, 2]	5
[4, -1, 2, 1]	6 ✅
[2, 1]	3
[1, -5, 4]	0
[4, -1, 2, 1, -5]	1

The largest sum is 6, so the answer is:
  6

 Code-

  ***Kadane's Algorithm-
int maxSoFar = nums[0];
int currentMax = nums[0];

for(int i = 1; i<nums.length; i++){
  currentMax = Math.max(nums[i], currentMax+nums[i]);
  maxSofar = Math.max(maxSofar, currentMax);
}
return maxSofar;
 }
}
