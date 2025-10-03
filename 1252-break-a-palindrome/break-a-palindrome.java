class Solution {
    public String breakPalindrome(String palindrome) {
        StringBuilder sb=new StringBuilder(palindrome);
        if(palindrome.length()==1) return ""; 
        int left=0,right=palindrome.length()-1,n=palindrome.length();
        while(left<n/2)
        {
            if(palindrome.charAt(left)=='a')
            {
                left++;
                right--;
            }
            else 
            {
                char ch='a';
                sb.setCharAt(left,ch);
                return sb.toString();
            }
        }
        sb.setCharAt(n-1,'b');
        return sb.toString();
    }
}