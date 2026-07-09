Think of it like this:

nums = [1,2,3,4]

We want to fill each position one by one.

Step 1
i = 0;

We're calculating ans[0].

Loop through the entire array (j = 0 to 3).

j = 0 → Skip (same as i)
j = 1 → Multiply by 2
j = 2 → Multiply by 3
j = 3 → Multiply by 4
product = 2 × 3 × 4 = 24
ans[0] = 24
Step 2
i = 1;

Now calculate ans[1].

j = 0 → Multiply by 1
j = 1 → Skip
j = 2 → Multiply by 3
j = 3 → Multiply by 4
product = 1 × 3 × 4 = 12
ans[1] = 12

Repeat this for every i.

Remember:
i = Which answer are we calculating?
j = Visit every element in the array.
if (i != j) = Skip the current element and multiply the rest.





  class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Output array
        int[] ans = new int[n];

        // Store left products
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Multiply with right products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        return ans;
    }
}
