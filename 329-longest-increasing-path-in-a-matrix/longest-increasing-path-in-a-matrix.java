class Solution {
    int[] dr = { -1, 0, 1, 0 };
    int[] dc = { 0, 1, 0, -1 };
    int n ,m;
    public int longestIncreasingPath(int[][] matrix) {
         n = matrix.length; m = matrix[0].length;
        int[][] dp = new int[n][m];
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 max=Math.max(max,recursion(matrix,dp,i,j));
            }
        }
        return max;
    }

    public int recursion(int[][] mat,int[][] dp, int i, int j) {
        if(dp[i][j]!=0) return dp[i][j];
        int count=1;
        for (int k = 0; k < 4; k++) {
            int r=i+dr[k];
            int c=j+dc[k];
            if (r >= 0 && r < n && c >= 0 && c < m) {
                 if(mat[i][j]>mat[r][c])
                 {
                   count=Math.max(count,1+recursion(mat,dp,r,c));
                 }
            }
        }
       dp[i][j]=count;
        return dp[i][j];
    }
}