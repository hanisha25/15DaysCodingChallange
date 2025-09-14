class Solution {
    int[][] dp;

    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] balloons=new int[n+2];
        balloons[0]=1;
        for(int i=0;i<nums.length;i++)
        {
            balloons[i+1]=nums[i];
        }
        balloons[n+1]=1;
        dp=new int[n+2][n+2];
        for(int[] r:dp)
        {
            Arrays.fill(r,-1);
        }
        return coins(balloons,0,n+1);

    }
    public int coins(int[] nums,int l,int r)
    {
        if((r-l)<=1) return 0;
        if(dp[l][r]!=-1) return dp[l][r];
        int res=Integer.MIN_VALUE;
        for(int i=l+1;i<r;i++)
        {
            int coins=nums[l]*nums[i]*nums[r]+coins(nums,l,i)+coins(nums,i,r);
            res=Math.max(coins,res);
        }
        return dp[l][r]=res;
    }
}