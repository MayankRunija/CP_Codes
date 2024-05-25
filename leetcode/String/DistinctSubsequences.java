class Solution {
    public int recursiveWithMemoization(String s, String t, int s_ind, int t_ind, int[][] dp) {
        if (t_ind == t.length()) {
            return 1;
        }
        if (s_ind == s.length()) {
            return 0;
        }

        if (dp[s_ind][t_ind] != -1) {
            return dp[s_ind][t_ind];
        }

        int take = 0, notTake = 0;

        if (s.charAt(s_ind) == t.charAt(t_ind)) {
            take = recursiveWithMemoization(s, t, s_ind + 1, t_ind + 1, dp);
        }

        notTake = recursiveWithMemoization(s, t, s_ind + 1, t_ind, dp);

        dp[s_ind][t_ind] = take + notTake;

        return dp[s_ind][t_ind];
    }

    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return recursiveWithMemoization(s, t, 0, 0, dp);
    }
}
