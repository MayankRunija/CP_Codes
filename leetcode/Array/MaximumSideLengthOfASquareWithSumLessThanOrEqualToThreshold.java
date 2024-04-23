class Solution {

    public int findSum(int dp[][],int i,int j,int k,int l) {

        int n = dp.length;
        int m = dp[0].length;

        if(k >= n || l >= m) {
            return Integer.MAX_VALUE;
        } 

        return dp[k][l] - dp[i-1][l] - dp[k][j-1] + dp[i-1][j-1];
    }
    
    public int maxSideLength(int[][] mat, int threshold) {
        int n = mat.length;
        int m = mat[0].length;

        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                dp[i+1][j+1] = mat[i][j] + dp[i][j+1];
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                dp[i+1][j+1] += dp[i+1][j];
            }
        }
    
        int ans = 0;

        for(int i=1;i<=n;i++) {
            for(int j = 1; j<=m ;j++) {
                for(int k = ans; k <= Math.min(n,m) ; k++ ) {
                    if(findSum(dp,i,j,i+k,j+k) <= threshold) {
                        ans = Math.max(ans,k+1);
                    }
                }
            }
        }
        return ans;
    }
}
