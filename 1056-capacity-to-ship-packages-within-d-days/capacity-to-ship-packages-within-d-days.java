class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights)
        {
            low=Math.max(low,w);
            high+=w;
        }
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(shipWeight(weights,days,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean shipWeight(int[] weights, int days,int wt)
    {
        int sum=0,day=1;
        for(int w:weights)
        {
            if(sum+w>wt)
            {
                day++;
                sum=0;
            }
            sum+=w;
        }
        return day<=days;
    }
}