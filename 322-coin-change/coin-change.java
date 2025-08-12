class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int dp[] = new int[amount + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) {
                if (c <= i && dp[i-c]!=Integer.MAX_VALUE) {
                    int val=dp[i-c]+1;
                    dp[i]=Math.min(dp[i],val);
                }
            }
        }
        return dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;
    }
}