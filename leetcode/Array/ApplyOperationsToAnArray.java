class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i+1<nums.length; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        reformat(nums);
        return nums;
    }

    public void reformat(int[] nums){
        for(int i=0, idx = 0; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, idx);
                idx++;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
