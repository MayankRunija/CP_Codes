class Solution {
    public int maxSum(int[] nums) {
        int ans = -1;

        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                int num1 = nums[i];
                int num2 = nums[j];


                int maxDigitInnum1 = 0;
                int maxDigitInnum2 = 0;

                while(num1 > 0){
                    int digit = num1 % 10;
                    num1 = num1 / 10;
                    maxDigitInnum1 = Math.max(maxDigitInnum1,digit);
                }
                while(num2 > 0){
                    int digit = num2 % 10;
                    num2 = num2 / 10;
                    maxDigitInnum2 = Math.max(maxDigitInnum2,digit);
                }
                if(maxDigitInnum1 == maxDigitInnum2){
                    ans = Math.max(ans,nums[i]+nums[j]);
                }
            }
        }
        return ans;
    }
}
