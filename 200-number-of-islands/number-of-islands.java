class Solution {
    int n,m;
    public int numIslands(char[][] grid) {
        n=grid.length;m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    dfs(grid,vis,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public int[] dr={-1,0,1,0};
    public int[] dc={0,1,0,-1};
    public void dfs(char[][] grid,boolean[][] vis,int row,int col)
    {
        vis[row][col]=true;
        for(int i=0;i<4;i++)
        {
            int r=row+dr[i];
            int c=col+dc[i];
            if(r>=0 && r<n && c>=0 && c<m &&grid[r][c]=='1' && !vis[r][c])
            {
                dfs(grid,vis,r,c);
            }
        }
    }
}