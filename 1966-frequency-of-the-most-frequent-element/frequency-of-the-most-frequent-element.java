class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=0,low=0,high=0;
        long sum=0;
        while(high<n)
        {
            sum+=nums[high];
            int size=high-low+1;
            if((long)nums[high]*size>(long)sum+k)
            {
               sum-=nums[low++];
               size=high-low+1;
            }
            max=Math.max(max,high-low+1);
            high++;
        }
        return max;
    }
}