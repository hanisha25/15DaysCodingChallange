class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=Integer.MIN_VALUE;
        for(int p:piles)
        {
            high=Math.max(high,p);
        }
        int banana=high;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if(numberOfBananas(piles,h,mid))
            {
                banana=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return banana;
    }
    public boolean numberOfBananas(int[] piles, int h,int mid)
    {
        long count=0;
        for(int p:piles)
        {
            count+=(p+mid-1)/mid;
        }
        return count<=h;
    }
}