class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++)
        {
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int up=dp[i-1][j];
                int left=(j>0)?dp[i-1][j-1]:Integer.MAX_VALUE;
                int right=(j<(m-1))?dp[i-1][j+1]:Integer.MAX_VALUE;
                dp[i][j]=matrix[i][j]+Math.min(up,Math.min(left,right));
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            ans=Math.min(ans,dp[n-1][i]);
        }
        return ans;
    }
}