class Solution {
    int[][] dp;

    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp = new int[prices.length + 2][2];
        for (int idx = n-1; idx >= 0; idx--) {
            for (int buy = 0; buy < 2; buy++) {
                if (buy == 1) {
                    dp[idx][1] = Math.max(dp[idx + 1][1],
                            -prices[idx] + dp[idx + 1][0]);
                } else {
                     dp[idx][0] = Math.max(dp[idx + 1][0],
                            prices[idx] + dp[idx + 2][1]);
                }
            }
        }
        return dp[0][1];
    }
}