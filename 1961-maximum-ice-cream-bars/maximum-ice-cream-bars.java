class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int max=0;
        for(int c:costs)
        {
            if(c>coins) break;
            else
            {
                coins-=c;
                max++;
            }
        }
        return max;
    }
}