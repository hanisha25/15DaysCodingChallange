class Solution {
    public boolean check(int[] nums) {
        int pivot=-1,n=nums.length;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                pivot=i+1;
            }
        }
        if(pivot==-1) return true;
        else
        {
            for(int i=0;i<n-1;i++)
            {
                if(nums[(pivot+i)%n]>nums[(pivot+i+1)%n])
                {
                    return false;
                }
            }
        }
        return true;
    }
}