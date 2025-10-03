class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] prefix=new long[nums.length];
        prefix[0]=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
           prefix[i]=nums[i]+prefix[i-1];
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(prefix[i]>=(prefix[n-1]-prefix[i]))
            {
                count++;
            }
        }
        return count;
    }
}