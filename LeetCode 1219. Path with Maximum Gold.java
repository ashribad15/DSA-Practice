class Solution 
{
   
        int directions[][]= {{-1,0},{1,0},{0,1},{0,-1}};

    public int getMaximumGold(int[][] grid)
     {
         int m = grid.length;
        int n = grid[0].length;
        int max=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              max = (int)Math.max(max, dfs(grid,i,j));
            }
        }

        return max;
        
    }
     
    

     int dfs( int grid[][], int i , int j)
     {
         int m = grid.length;
        int n = grid[0].length;

          if(i>=m || i<0 || j>=n || j<0 || grid[i][j]==0)
          return 0;

           int ov =grid[i][j];
     grid[i][j]=0;
     
      int maxg=0;
     
        for(int d[] : directions)
        {
            int ni =i+d[0];
            int nj =j+d[1];

            maxg = Math.max(maxg,dfs(grid,ni,nj));


        }

        grid[i][j]=ov;
        return ov+maxg;

     }
}
