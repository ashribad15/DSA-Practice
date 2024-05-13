class Solution {
    public int matrixScore(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++)
        {
            if(grid[i][0]==0)
            {
                for(int j=0;j<m;j++)
                {
                    if(grid[i][j]==0)
                    grid[i][j]=1;
                    else
                    grid[i][j]=0;
                }
            }
        }
   
   int y=1;

    while(y<m)
   {
    int cz=0;
       for(int j=0;j<n;j++)
        {
            if(grid[j][y]==0)
            {
                cz++;
            }
        }

        int co=n-cz;
        if(co<cz)
        {
            for(int j=0;j<n;j++)
            {
                 if(grid[j][y]==0)
                    grid[j][y]=1;
                    else
                    grid[j][y]=0;
            }
        }

        y++;
   }

 int s=0;
   for(int i=0;i<n;i++)
   { 
    int v=0;
    for(int j=0;j<m;j++)
    {
        v=v+ (int)(grid[i][j]*Math.pow(2,m-j-1));
    }
    s=s+v;
   }
        

        return s;
        
    }
}
