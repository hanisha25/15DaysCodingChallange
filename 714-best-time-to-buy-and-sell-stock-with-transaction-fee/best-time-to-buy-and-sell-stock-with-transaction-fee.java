class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][] dp = new int[prices.length + 1][2];
        for (int idx = n-1; idx >= 0; idx--) {
            for (int buy = 0; buy < 2; buy++) {
                if (buy == 1) {
                    dp[idx][1] = Math.max(dp[idx + 1][1],
                            -(prices[idx]+fee) + dp[idx + 1][0]);
                } else {
                     dp[idx][0] = Math.max(dp[idx + 1][0],
                            prices[idx] + dp[idx + 1][1]);
                }
            }
        }
        return dp[0][1];
    }
    // public int recursion(int[] prices,int idx,int buy)
    // {
    //     if(idx>=prices.length)
    //     {
    //         return 0;
    //     }
    //     if(dp[idx][buy]!=-1) return dp[idx][buy];
    //     if(buy==1 )
    //     {
    //         return dp[idx][1]=Math.max(recursion(prices,idx+1,1),-(prices[idx]+fees)+recursion(prices,idx+1,0));
    //     }
    //     else
    //     {
    //         return dp[idx][0]=Math.max(recursion(prices,idx+1,0),prices[idx]+recursion(prices,idx,1));
    //     }
    // }
}