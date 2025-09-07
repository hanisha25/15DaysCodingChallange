class Solution {
    int[][] dp;
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }
        return recursion(prices,0,1);
    }
    public int recursion(int[] prices,int idx,int buy)
    {
        if(idx>=prices.length)
        {
            return 0;
        }
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1 )
        {
            return dp[idx][1]=Math.max(recursion(prices,idx+1,1),-prices[idx]+recursion(prices,idx+1,0));
        }
        else
        {
            return dp[idx][0]=Math.max(recursion(prices,idx+1,0),prices[idx]+recursion(prices,idx+2,1));
        }
    }
}