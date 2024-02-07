class Solution {
    public int findKOr(int[] nums, int k) {
        int len=nums.length;
        int ans=0;
        for(int i=0;i<32;i++){
             
            int count=0;
            
            for(int j=0;j<len;j++){
                int n=nums[j];
                //n=n>>i;
                if(((n>>i)&1)!=0){
                    count++;
                }
            }
            if(count>=k){
                ans=ans+(1<<i);
            }
             
        }
         

        return ans;
    }
}
