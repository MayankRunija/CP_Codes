class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        boolean[][] check=new boolean[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    if(grid[i][j]==0 || grid[i][n-j-1]==0){
                        return false;
                    }else{
                        check[i][j]=true;
                        check[i][n-1-j]=true;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(check[i][j]==false){
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
