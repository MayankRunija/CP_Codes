class Solution {
    public boolean check(int mid,int[] nums,int threshold){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]/mid;
            if(nums[i]%mid!=0){
                sum++;
            }
        }return sum<=threshold;
    }





    public int smallestDivisor(int[] nums, int threshold) {
        
        Arrays.sort(nums);
        int ans=-1;
        int low=1;
        int high=nums[nums.length-1];
        while(low<=high){
            int mid=(low+high)/2;
            if(check(mid,nums,threshold)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        
    return ans;}
}
