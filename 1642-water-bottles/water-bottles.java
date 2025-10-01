class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int res=0;
        while(ans>=numExchange)
        {
            res+=(ans/numExchange);
            ans=(ans/numExchange)+(ans%numExchange);
        }
        return numBottles+res;
    }
}