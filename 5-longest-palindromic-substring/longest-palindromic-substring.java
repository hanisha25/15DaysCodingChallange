class Solution {
    int n=0;
    public String longestPalindrome(String s) {
        String ans="";
        n=s.length();
        for(int i=0;i<s.length();i++)
        {
            String odd=palindrome(s,i,i);
            String even=palindrome(s,i,i+1);
            if(ans.length()<odd.length() || ans.length()<even.length())
            {
                ans=(odd.length()>even.length())?odd:even;
            }
        }
        return ans;
    }
    public String palindrome(String s,int i,int j)
    {
        while(i>=0 && j<n)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i--;
                j++;
            }
            else break;
        }
        return s.substring(i+1,j);
    }
}