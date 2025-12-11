class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0,el=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==el)
            {
                cnt++;
            }
            else
            {
                cnt--;
                if(cnt==0)
                {
                    el=nums[i];
                    cnt=1;
                }
            }
        }
        return el;
    }
}