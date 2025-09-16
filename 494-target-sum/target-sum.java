class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int n:nums)
        {
            sum+=n;
        }
        int subset_sum=sum-target;
        if(subset_sum<0 || (subset_sum%2)!=0)
        {
            return 0;
        }
        return target(nums,subset_sum/2);
    }
    public int target(int[] nums, int target)
    {
        int n=nums.length;
        int[][] dp=new int[n+1][target+1];
        for(int i=0;i<=n;i++) dp[i][0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=target;j++)
            {
                int v=nums[i-1];
                if(v<=j)
                {
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-v];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
}