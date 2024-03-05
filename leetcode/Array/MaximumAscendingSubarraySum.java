
class Solution {
    public int maxAscendingSum(int[] nums) {
        int[] arr = new int[101];

        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < 1){
                arr[j] += nums[i];
            }else if(nums[i] > nums[i-1]){
                arr[j] += nums[i];
            }else{
                j++;
                arr[j] += nums[i];
            }
        }

        int max = 0;

        for(int i = 0; i <= j; i++){
            if(arr[i] > max) max = arr[i];
        }

        return max;
    }
}
