class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int maxim = 0;
        for (int i = 0; i < n; i++) {
                if (checkPrime(nums[i][i])) {
                    maxim = Math.max(maxim, nums[i][i]);
                } 
                if (checkPrime(nums[n-1-i][i])) {
                    maxim = Math.max(maxim, nums[n - i - 1][i]);

                }
            
        }
        return maxim;
    }
    public boolean checkPrime(int k) {

        int count = 0;
        if (k == 1) {
            return false;
        }
        for (int i = 1; i * i <= k; i++) {
          if (k % i == 0) {
              count += 2;
          }
      }
      if (count == 2) {
          return true; 
      } else {
          return false;
      }
      
    }

}
