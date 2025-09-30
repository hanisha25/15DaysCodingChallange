class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        while(nums.length>1)
        {
            nums=sum(nums,new int[nums.length-1]);
        }
        return nums[0];
    }
    public int[] sum(int[] nums,int[] temp)
    {
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=(nums[i]+nums[i+1])%10;
        }
        return temp;
    }
}