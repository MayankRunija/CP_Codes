class Solution {
    public int arrayPairSum(int[] nums) {
        int temp[] = new int[20001];
        for(int i: nums){
            temp[i+10000]++;
        }
        int sum=0 , p=0;
        for(int i=0; i<20001; i++){
            if(temp[i]==0) continue;
            while(temp[i]!=0){
                if(p%2==0){
                    sum+=(i-10000);
                }
                p++;
                temp[i]--;
            }
        }
        return sum;


//    Another solutions 

        // int max = 0;
        // Arrays.sort(nums);
        // for(int i = 0; i<nums.length; i = i+2){
        //     max = max + Math.min(nums[i],nums[i+1]);
        // }
        // return max;
    }
}
