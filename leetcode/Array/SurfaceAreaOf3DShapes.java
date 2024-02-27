class Solution {

public int surfaceArea(int[][] grid) {
int total = 0;
int n = grid.length;

for(int i =0; i<n; i++)
{
    for(int j =0; j<n; j++)
    {
        if(grid[i][j]>0)
            total += 6*grid[i][j]-2*(grid[i][j]-1); 
        
        if(i>0)
            total-= 2*Math.min(grid[i-1][j],grid[i][j]);
        
        if(j>0)
            total-= 2*Math.min(grid[i][j-1],grid[i][j]);
    }
}
return total;
}
}
