class Solution {
    public int minimumPushes(String word) {
        int length=word.length();
        if(length<=8)
        {
            return length;
        }
        else
        {
            int cost=8;
            length-=8;
            int count=2;
            while(length>0)
            {
                if(length>=8)
                {
                    cost+=(8*count);
                    length-=8;
                }
                else
                {
                    cost+=(length*count);
                    length-=length;
                }
                count++;
            }
            return cost;
        }
    }
}