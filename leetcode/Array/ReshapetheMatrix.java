class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int oldRow = mat.length;
        int oldCol = mat[0].length;


        if(oldCol*oldRow != r*c) return mat;

        int [] [] arr = new int[r][c];
        int i = 0;      
        int j = 0;      
        int k = 0;      
        int l = 0;      

       
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                arr[i][j] = mat[k][l];

                l++;
                if(l == oldCol)
                {
                    k++;
                    l = 0;
                }

            }
        }
        return arr;
        
    }
}
