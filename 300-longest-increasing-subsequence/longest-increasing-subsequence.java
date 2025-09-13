class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int max=1;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i] && dp[i]<dp[j]+1)
                {
                   dp[i]=dp[j]+1;
                }
            }
            if(dp[i]>max)
            {
                max=dp[i];
            }
        }
        return max;
    }
}