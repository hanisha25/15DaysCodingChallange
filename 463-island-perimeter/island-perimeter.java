class Solution {
    int n,m;
    int per=0;
    public int islandPerimeter(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    island(grid,vis,i,j);
                    return per;
                }
            }
        }
        return per;
    }
    int[] row={-1,0,1,0};
    int[] col={0,1,0,-1};
    public void island(int[][] grid,boolean[][] vis,int i,int j)
    {
        vis[i][j]=true;
        for(int k=0;k<4;k++)
        {
            int r=i+row[k];
            int c=j+col[k];
            if(r<0 || r>=n || c<0 || c>=m || grid[r][c]==0)
            {
                per++;
            }
            else if(!vis[r][c])
            {
                island(grid,vis,r,c);
            }
        }
    }
}
