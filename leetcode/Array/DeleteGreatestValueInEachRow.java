import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int result = 0;

        // sorting the matrix row wise
        for (int i = 0; i < m; i++) 
            Arrays.sort(grid[i]);
        

        // adding the max value from each column to the result
        for (int j = 0; j < n; j++) {
            int maxInColumn = -1;
            for (int i = 0; i < m; i++) {
                maxInColumn = Math.max(maxInColumn, grid[i][j]);
            }
            result += maxInColumn;
        }

        return result;
    }
}
