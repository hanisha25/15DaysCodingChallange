class Solution {
    public int arrangeCoins(int n) {
       int coins=n;
       int count=0;
       int val=1;
       while(coins>=0)
       {
            if(coins<val) break;
            coins-=val;
            val++;
            count++;
       }
       return count;
    }
}