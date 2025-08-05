class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)
        {
            return s;
        }
        String ans=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++)
        {
            String oddString=palindrome(i,i,s);
            String evenString=palindrome(i,i+1,s);
            if(ans.length()<oddString.length() || ans.length()<evenString.length())
            {
                ans=(oddString.length()>evenString.length())?oddString:evenString;
            }
        }
        return ans;
    }
    public String palindrome(int i,int j,String s)
    {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}