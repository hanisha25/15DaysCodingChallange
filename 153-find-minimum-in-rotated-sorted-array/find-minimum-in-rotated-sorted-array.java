class Solution {
    public int findMin(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]>nums[i+1])
            {
                return nums[i+1];
            }
        }
        return nums[0];
    }
}