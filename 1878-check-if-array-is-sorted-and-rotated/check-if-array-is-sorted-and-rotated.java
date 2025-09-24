class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                pivot=i+1;
                break;
            }
        }
        if(pivot==-1) return true;
        for(int i=pivot;i<n;i++)
        {
            if(nums[i]>nums[(1+i)%n])
            {
                return false;
            }
        }
        return true;
    }
}