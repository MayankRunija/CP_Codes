class Solution {
    public int fillCups(int[] nums) {
        int ans=0;
        while(true){
            if(nums[0]<=0 && nums[1]<=0 && nums[2]<=0) break;
            if(nums[0]>=nums[1] && nums[2]>=nums[1]){
                ans++;
                nums[0]--;
                nums[2]--;
            }else if(nums[0]>=nums[2] && nums[1]>=nums[2]){
                ans++;
                nums[0]--;
                nums[1]--;
            }else{
                ans++;
                nums[1]--;
                nums[2]--;
            }
        }
        return ans;
    }
}
