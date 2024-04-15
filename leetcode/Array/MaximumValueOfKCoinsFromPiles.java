class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        //dp[i][j] means when we just use the first i piles and j picks, the maximum coins we can get
        int[][] dp = new int[piles.size()+1][k+1];
        for (int i = 1; i <= piles.size(); i++){
            for (int j = 1; j <= k; j++){
                int sum = 0;
                // At first we don't pick anything, so the coins you can get is the same and for i-1 condition
                dp[i][j] = dp[i-1][j];
                //Begin to traverse the ith pile
                //Note here we use min function to prevent index out of bound
                for (int h = 0; h < Math.min(j, piles.get(i-1).size()); h++){
                    //We take the current (hth) coin
                    sum += piles.get(i-1).get(h);
                    //Check if pick it can maximize our score
                    //Note that if we pick it, we can only get the coins for j-1-h picks when we are at i-1th coin
                    dp[i][j] = Math.max(dp[i][j], sum + dp[i-1][j-1-h]);
                }
            }
        }
        //The result is when we use all of the piles and k picks
        return dp[piles.size()][k]; 
    }
}
