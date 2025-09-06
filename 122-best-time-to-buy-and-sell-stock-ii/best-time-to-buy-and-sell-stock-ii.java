class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[prices.length+1][2];
        for (int idx = n-1; idx>=0; idx--) {
            for (int take = 0; take < 2; take++) {
                if (take == 1) {
                    dp[idx][1] = Math.max(dp[idx + 1][1], prices[idx] + dp[idx+1][0]);
                } else {
                    dp[idx][0] = Math.max(dp[ idx + 1][0], -prices[idx] +  dp[idx + 1][1]);
                }
            }
        }
        return dp[0][0];
    }

}