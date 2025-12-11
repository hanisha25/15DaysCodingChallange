class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0,buy=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int profit=prices[i]-buy;
            maxprofit=Math.max(maxprofit,profit);
            buy=Math.min(buy,prices[i]);
        }
        return maxprofit;
    }
}