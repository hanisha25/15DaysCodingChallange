class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int[] d:dp)
        {
            Arrays.fill(d,Integer.MAX_VALUE);
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=amount;j++)
            {
                int c=coins[i-1];
                if(c<=j && dp[i][j-c]!=Integer.MAX_VALUE)
                {
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-c]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return (dp[n][amount]==Integer.MAX_VALUE)?-1:dp[n][amount];
    }
}