class Solution {
    int[][] dp;
    public int minCost(int n, int[] cuts) {
        int m=cuts.length;
        Arrays.sort(cuts);
        int[] cut = new int[m + 2];
        for (int i = 0; i < m; i++) {
            cut[i + 1] = cuts[i];
        }
        cut[cut.length - 1] = n;
        dp=new int[m+2][m+2];
        for (int[] row : dp) Arrays.fill(row, -1);
        return util(cut, 0, m+1);
    }

    public int util(int[] nums,int l,int r)
    {
        if((r-l)<=1)
        {
            return 0;
        }
        if(dp[l][r]!=-1) return dp[l][r];
        int res=Integer.MAX_VALUE;
        for(int i=l+1;i<r;i++)
        {
            int cost=(nums[r]-nums[l])+util(nums,l,i)+util(nums,i,r);
            res=Math.min(res,cost);
        }
        return dp[l][r]=res;
    }
}