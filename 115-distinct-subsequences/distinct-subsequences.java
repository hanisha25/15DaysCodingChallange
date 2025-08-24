class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length(),n=t.length();
        int[][] dp=new int[m][n];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }
        return recursion(m-1,s,n-1,t,dp);
    }
    public int recursion(int i ,String s , int j , String t,int[][] dp)
    {
        if(j<0) return 1;
        if(i<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j))
        {
            return dp[i][j]=recursion(i-1,s,j-1,t,dp)+recursion(i-1,s,j,t,dp);
        }
        else
        {
            return dp[i][j]=recursion(i-1,s,j,t,dp);
        }
    }
}