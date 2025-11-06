class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int cur=x;
        int num=0;
        while(cur>0)
        {
            int temp=cur%10;
            num=num*10+temp;
            cur/=10;
        }
        return num==x;
    }
}