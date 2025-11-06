class Solution {
    public int reverse(int x) {
        int neg=1;
        if(x<0)
        {
            neg=-1;
            x=x*-1;
        }
        int num=0;
        while(x>0)
        {
           int temp=x%10;
           if(num<Integer.MIN_VALUE/10||num>Integer.MAX_VALUE/10)
            {
                return 0;
            }
           num=num*10+temp;
           x/=10;
        }
        return (neg*num);
    }
}