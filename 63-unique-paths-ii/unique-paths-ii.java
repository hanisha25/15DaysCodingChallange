class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int[][] grid=new int[n][m];
        for(int i=0;i<n;i++)
        {
            if(obstacleGrid[i][0]==1)
            {
                break;
            }
            grid[i][0]=1;
        }
        for(int i=0;i<m;i++)
        {
            if(obstacleGrid[0][i]==1)
            {
                break;
            }
            grid[0][i]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(obstacleGrid[i][j]==1)
                {
                    continue;
                }
                else
                {
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }
            }
        }
        return grid[n-1][m-1];
    }
}