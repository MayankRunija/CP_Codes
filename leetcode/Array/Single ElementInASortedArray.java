class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        return divideArray(nums, low, high);
    }

    public static int divideArray(int[] nums, int low, int high){
        if (low > high) {
            return -1; // Base case: array cannot be divided further
        }
        
        int mid = low + (high - low) / 2;
        
        if (mid == 0 || mid == nums.length - 1 || nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
            return nums[mid];
        }
        
        if (nums[mid] == nums[mid - 1]) {
            if ((mid - 1 - low) % 2 != 0) { // Check if the left subarray has even length
                return divideArray(nums, low, mid - 2);
            }
            else{
                return divideArray(nums, mid+1, high);
            }
        } else {
            if ((high - (mid + 1)) % 2 != 0) { // Check if the right subarray has even length
                return divideArray(nums, mid+2, high);
            } else {
                return divideArray(nums, low, mid-1);
            }
        }
    }
}
