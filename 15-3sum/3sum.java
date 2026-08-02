class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //sort first
        Arrays.sort(nums);
        //loop through fix the first nummber
        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int l = i+1;
            int r = nums.length-1;

            //two pointer search for remaining 2 numbers

            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0){
                    //Add the valid triplet to our result list

                    List<Integer> tri = new ArrayList<>();
                    tri.add(nums[i]);
                    tri.add(nums[l]);
                    tri.add(nums[r]);
                    res.add(tri);
                    
                    //move the pointers inward to find the next unique numbers
                    l++;
                    r--;

                    //skip identical left numbers
                    while(l<r && nums[l]== nums[l-1]){
                        l++;
                    }

                    //skip identical right
                    while(l<r && nums[r] == nums[r+1]){
                        r--;
                    }
                }else if(sum<0){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
            return res;
        }
    }
