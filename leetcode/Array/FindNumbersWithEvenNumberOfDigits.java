class Solution {
    public int findNumbers(int[] nums) {
         int count=0;
        for(int i=0;i<nums.length;i++)
        {
              if(evennum(nums[i]))
              {
              count++;
              }
        
         } 
         return count;
  }
  boolean evennum(int num)
        {
             int digit=digit(num);
        
            return digit%2==0;

        }
        int digit(int  num)
        { int count=0;
            while(num>0)
            {
                 num=num/10;
                 count++;
                
            }
            return count++;
        }
}
