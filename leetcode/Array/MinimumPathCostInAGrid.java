class Solution {
    public int rec(int i,int j,int[][]grid,int[][]move,int [][]dp){
        if(i==grid.length-1)return grid[i][j];
        if(dp[i][j]!=-1)return dp[i][j];
        int max=Integer.MAX_VALUE;
        for(int k=0;k<grid[0].length;k++){
            int moveCost=grid[i][j]+move[grid[i][j]][k];
            max=Math.min(max,moveCost+rec(i+1,k,grid,move,dp));
        }
        return dp[i][j]=max;
    }
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=Integer.MAX_VALUE;
        int dp[][]=new int[m][n];
        for(int[] x : dp) Arrays.fill(x,-1);
        for(int i=0;i<n;i++){
            ans=Math.min(ans,rec(0,i,grid,moveCost,dp));
        }        
        return ans;
    }
}
