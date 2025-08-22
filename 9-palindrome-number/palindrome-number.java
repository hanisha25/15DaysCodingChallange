class Solution {
    public boolean isPalindrome(int x) {
        int cur=x;
        int rev=0;
        while(cur>0){
            int n=cur%10;
            rev=rev*10+n;
            cur=cur/10;
        }
        return rev==x;
    }
}