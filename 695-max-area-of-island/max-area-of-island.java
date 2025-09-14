class Solution {
    int m,n;
    public int maxAreaOfIsland(int[][] grid) {
         m=grid.length;
         n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int count=0;
                if(!vis[i][j] && grid[i][j]==1)
                {
                     count=dfs(grid,vis,i,j);
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
    int[] row={-1,0,1,0};
    int[] col={0,1,0,-1};
    public int dfs(int[][] grid,boolean[][] vis,int i,int j)
    {
        int count=1;
        vis[i][j]=true;
        for(int k=0;k<4;k++)
        {
            int r=i+row[k];
            int c=j+col[k];
            if(r>=0 && r<m && c>=0 && c<n && grid[r][c]==1 && vis[r][c]==false)
            {
                count+=dfs(grid,vis,r,c);
            }
        }
        return count;
    }
}