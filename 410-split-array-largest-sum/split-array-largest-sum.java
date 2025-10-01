class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MAX_VALUE,high=0;
        for(int n:nums)
        {
            low=Math.min(low,n);
            high+=n;
        }
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(split(nums,k,mid))
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
    public boolean split(int[] nums, int k , int mid)
    {
        int count=1;
        int sum=0;
        for(int n:nums)
        {
            if (n > mid)
                return false;
            sum+=n;
            if(sum>mid)
            {
                count++;
                sum=n;
            }
        }
        return count<=k;
    }
}