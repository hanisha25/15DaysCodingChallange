class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MAX_VALUE;
        int high=0;
        int ans=0;
        for(int i=0;i<weights.length;i++)
        {
            low=Math.min(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(packWeights(weights,days,mid))
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
    public boolean packWeights(int[] weights, int days,int wt)
    {
        int count=1;
        int cap=0;
        for(int w:weights)
        {
            if(w>wt) return false;
            cap+=w;
            if(cap>wt)
            {
                cap=w;
                count++;
            }
        }
        return count<=days;
    }
}