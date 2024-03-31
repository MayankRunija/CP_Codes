class Solution {
    public int arraySign(int[] nums) 
    {
        int sign=1;
        int length=nums.length;
        for(int i=0;i<length;i++)
        {
            if(nums[i]==0)  // immediately return 0 if encounter 0
                return 0;
            if(nums[i]<0)
                sign=-sign;  // alternating sign whenever encountering a negative element is encountered
        }
        return sign;
    }
}
