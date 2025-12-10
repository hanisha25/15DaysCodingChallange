class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int maxLen=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                ones++;
            }
            else
            {
                maxLen=Math.max(maxLen,ones);
                ones=0;
            }
        }
        maxLen=Math.max(maxLen,ones);
        return maxLen;
    }
}