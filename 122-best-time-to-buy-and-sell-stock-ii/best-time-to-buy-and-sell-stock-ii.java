class Solution {
    int[][] dp;
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }
        return profit(prices,0,0);
    }
    public int profit(int[] prices,int idx,int take)
    {
        if(idx==prices.length) return 0;
        if(dp[idx][take]!=-1) return dp[idx][take];
        if(take==1)
        {
            return dp[idx][1]=Math.max(profit(prices,idx+1,1),prices[idx]+profit(prices,idx+1,0));
        }
        else
        {
           return  dp[idx][0]=Math.max(profit(prices,idx+1,0),-prices[idx]+profit(prices,idx+1,1));
        }
    }
}