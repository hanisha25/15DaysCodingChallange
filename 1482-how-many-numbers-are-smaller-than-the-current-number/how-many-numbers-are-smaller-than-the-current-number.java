class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int el=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(i==j) continue;
                if(el>nums[j])
                {
                    res[i]++;
                }
            }
        }
        return res;
    }
}