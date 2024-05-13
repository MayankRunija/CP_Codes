class Solution {
    public int waysToMakeFair(int[] nums) {
        int oddprefix[]=new int[nums.length];
        int evenprefix[]=new int[nums.length];
        int odd=0;int even=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even+=nums[i];
                oddprefix[i]=odd;
                evenprefix[i]=even;                     
            }
            else{
                odd+=nums[i];
                oddprefix[i]=odd;
                evenprefix[i]=even;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                int newodd=oddprefix[i]-nums[i]+even-evenprefix[i];
                int neweven=evenprefix[i]+odd-oddprefix[i];
                if(newodd==neweven){
                    count++;
                }
            }
            else{
               int neweven=evenprefix[i]-nums[i]+odd-oddprefix[i];
                int newodd=oddprefix[i]+even-evenprefix[i];
                if(newodd==neweven){
                    count++;
                } 
            }
        }
      return count;
    }
}
