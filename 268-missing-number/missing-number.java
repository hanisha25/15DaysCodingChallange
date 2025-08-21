class Solution {
    public int missingNumber(int[] nums) {
        boolean[] vis=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            vis[nums[i]]=true;
        }
        for(int i=0;i<vis.length;i++)
        {
            if(!vis[i])
            {
                return i;
            }
        }
        return -1;
    }
}