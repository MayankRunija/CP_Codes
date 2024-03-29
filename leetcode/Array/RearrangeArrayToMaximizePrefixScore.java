class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long[] prefix = new long[n];
        long sum = 0;
        int ans = 0;
        for(int i = n - 1; i >= 0; i--){
            sum += nums[i];
            prefix[i] = sum;
            if(prefix[i] > 0) ans++;
        }
        return ans;
    }
}
