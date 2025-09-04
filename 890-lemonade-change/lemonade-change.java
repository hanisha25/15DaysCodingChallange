class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int b:bills)
        {
            if(b==5)
            {
                five++;
            }
            else if(b==10)
            {
                ten++;
                if(five<1)
                {
                    return false;
                }
                else
                {
                    five--;
                }
            }
            else
            {
                if(five>=1 && ten>=1)
                {
                    five--;
                    ten--;
                }
                else if(five>=3)
                {
                    five-=3;
                }
                else 
                {
                    return false;
                }
            }
        }
        return true;
    }
}