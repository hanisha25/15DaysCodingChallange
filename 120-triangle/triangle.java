class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=triangle.get(n-1).size();
        int[][] dp=new int[n][m];
        for(int[] t:dp)
        {
            Arrays.fill(t,Integer.MAX_VALUE);
        }
        dp[0][0]=triangle.get(0).get(0);
        for(int i=1;i<n;i++){
            for(int j=0;j<triangle.get(i).size();j++){
                if(j==0)
                {
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                }
                else{
                    dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i-1][j-1],dp[i-1][j]);
                }
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {
            res=Math.min(res,dp[n-1][i]);
        }
        return res;
    }
}