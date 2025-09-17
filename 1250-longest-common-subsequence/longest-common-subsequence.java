class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int t1=text1.length();
        int t2=text2.length();
        int[][] dp=new int[t1+1][t2+1];
        for(int i=1;i<=t1;i++)
        {
            for(int j=1;j<=t2;j++)
            {
                int ch1=text1.charAt(i-1);
                int ch2=text2.charAt(j-1);
                if(ch1==ch2)
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[t1][t2];
    }
}