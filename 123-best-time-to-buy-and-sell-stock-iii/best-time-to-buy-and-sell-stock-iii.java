class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[prices.length + 1][2][3];
        for (int i = n-1; i >= 0; i--) {
            for (int take = 0; take < 2; take++) {
                for (int count = 0; count < 2; count++) {
                    if (take == 1) {
                        dp[i][take][count] = Math.max(dp[i + 1][take][count],
                                -prices[i] + dp[i + 1][0][count]);
                    } else {
                        dp[i][take][count] = Math.max(dp[i + 1][take][count],
                                prices[i] + dp[i + 1][1][count+1]);
                    }
                }
            }
        }
        return dp[0][1][0];
    }
}