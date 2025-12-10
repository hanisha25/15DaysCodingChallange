class Solution {
    int n;
    int[][] dp;
    public int minDifficulty(int[] jobDifficulty, int d) {
        n=jobDifficulty.length;
        dp=new int[n+1][d+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        if(n<d) return -1;
        return minimum(jobDifficulty,d,0);
    }
    public int  minimum(int[] jobs,int d,int idx)
    {
        if(d==1)
        {
            int max=0;
            for(int i=idx;i<n;i++)
            {
                max=Math.max(max,jobs[i]);
            }
            return max;
        }
        if(dp[idx][d]!=-1)
        {
            return dp[idx][d];
        }
        int ans=Integer.MAX_VALUE;
        int max=0;
        for(int i=idx;i<=n-d;i++)
        {
            max=Math.max(max,jobs[i]);
            int solve=minimum(jobs,d-1,i+1);
            ans=Math.min(ans,max+solve);
        }
        return dp[idx][d]=ans;
    }
}