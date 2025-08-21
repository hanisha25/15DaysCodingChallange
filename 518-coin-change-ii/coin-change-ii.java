class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                  int c=coins[i-1];
                  dp[i][j]=dp[i-1][j];
                  if(c<=j)
                  {
                    dp[i][j]+=dp[i][j-c];
                  }
            }
        }
        return dp[n][amount];
    }
}