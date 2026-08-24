class Solution {
    
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    private void mergeSort(int[] nums, int left, int right) {
        
        // Base case
        if (left >= right) {
            return;
        }
        
        int mid = left + (right - left) / 2;
        
        // Divide and sort both halves
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        
        // Merge sorted halves
        merge(nums, left, mid, right);
    }
    
    private void merge(int[] nums, int left, int mid, int right) {
        
        int[] temp = new int[right - left + 1];
        
        int i = left;
        int j = mid + 1;
        int k = 0;
        
        // Compare both halves
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        
        // Remaining elements in left half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        
        // Remaining elements in right half
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        
        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}