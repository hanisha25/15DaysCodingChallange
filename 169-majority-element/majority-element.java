class Solution {
    public int majorityElement(int[] nums) {
        int count=0,el=0;
        for(int n:nums)
        {
            if(count==0)
            {
                el=n;
                count++;
            }
            else if(el==n)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return el;
    }
}