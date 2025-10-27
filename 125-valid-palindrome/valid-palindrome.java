class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length()-1;
        int i=0,j=n;
        while(i<j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}