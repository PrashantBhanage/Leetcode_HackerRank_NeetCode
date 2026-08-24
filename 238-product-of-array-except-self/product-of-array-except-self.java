class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] op = new int[n];

            int lp =1;
        for(int i = 0; i<n; i++){
            op[i] = lp;
            lp *=nums[i];
        }

        //multiply now by right side
        //int rp = 1;
            int rp = 1;
        for(int i = n-1; i>=0; i--){
            op[i] *= rp;
            rp *=nums[i];
        }
        return op;
    }
}