class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0,  nums.length-1);
        return nums;
    }

    //2. recursive function to divide the array
    private void mergeSort(int[] nums, int l, int r){
        if(l<r){
            //find the middle point
            int mid = l + (r-l)/2;

            //Divide. Sort first and second halves
            mergeSort(nums,l,mid);
            mergeSort(nums, mid+1, r);

            //Conquer & combine. Merge the sorted halves
            merge(nums,l,mid,r);
        }
    }
    //3. The helper fucntion to combine the sorte pieces
    private void merge(int[] nums, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        //create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        //copy data to temp arrays

        for(int i = 0; i<n1; i++){
            leftArray[i] = nums[l+i];
        }
        for(int j=0; j<n2; j++){
            rightArray[j] = nums[mid+1+j];
        }

        //merge the temp arrays back into org nums[]
        int i = 0, j = 0;
        int k = l;

        while(i<n1 && j<n2){
            if(leftArray[i] <= rightArray[j]){
                nums[k] = leftArray[i];
                i++;
            }else{
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //copy remaining elements of leftArray[] if any  
        while(i<n1){
            nums[k] = leftArray[i];
            i++;
            k++;
        }
        //copy remaining elements of RightArray[] if any

        while(j<n2){
            nums[k] = rightArray[j];
            j++;
            k++;
        }

    }

}