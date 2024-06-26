class Solution {
    public int minDifference(int[] nums) {
        if (nums.length<5) return 0;
        int ans = 0;
        int temp = 0;
        Arrays.sort(nums);
        int n = nums.length-1;
        ans = nums[n-3]-nums[0];
        temp = nums[n]-nums[3];
        ans = Math.min(ans, temp);
        temp = nums[n-1]-nums[2];
        ans = Math.min(ans, temp);
        temp = nums[n-2]-nums[1];
        ans = Math.min(ans, temp);
        return ans;
        
    }
}
