class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0,  nums.length-1); //mergeSort() divides the array
        return nums;
    }

    public void mergeSort(int[] nums,int l,int h){
        if(l<h){
            int mid = (l+h)/2;
            //sort left  half
            mergeSort(nums,l,mid);

            //sort right half
            mergeSort(nums,mid+1,h);

            //now merge both sorted arrays
            merge(nums,l,mid,h);
        }
    }

    public void merge(int[] nums, int l,int mid,int h){
        int i = l;
        int j = mid+1;
        int k = 0;

        //compare elements from both halves
        int[] temp = new int[h - l + 1];
        while(i<=mid && j<=h){
            if(nums[i]<=nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        //copy remaining elements from left half
        while(i<=mid){
            temp[k] = nums[i];
            i++;
            k++;
        }

        //copy remaining ele from right
        while(j<=h){
            temp[k] = nums[j];
            j++;
            k++;
        }

        //copy temp back to nums
        for(i = l, k=0; i <= h; i++, k++){
            nums[i] = temp[k];
        }
    }

}
