class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int low=0;
        int count=1,max=1;
        for(int high=1;high<nums.length;high++)
        {
            while(high<nums.length && nums[high]>nums[high-1])
            {
                high++;
                count++;
            }
            max=Math.max(max,count);
            count=1;
        }
        return max;
    }
}