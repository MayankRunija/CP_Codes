class Solution {
    public char[][] rotateTheBox(char[][] box) {
        
        int n=box.length;
        int m=box[0].length;

        char newbox[][] = new char[m][n];
      // here we are using clock wise rotaion
      // so oth column become n-1th row;  
        int l=n-1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                newbox[j][l]=box[i][j];
            }
            l--;
        }
        // after rotating
      
     
       

        for(int j=0; j<n; j++)
        {
           
           int i=m-1;
           int k=m-1;

           while(i>=0)
           {
              if(newbox[i][j]=='#'||newbox[i][j]=='*')
              {
                  if(newbox[i][j]=='*')
                  {
                      k=i-1;
                  }
                  else if(newbox[i][j]=='#')
                  {
                      newbox[i][j]='.';
                      newbox[k][j]='#';
                      k--;
                  }
              }
              i--;
           }
        }
      return newbox;
    }
}
