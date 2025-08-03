class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++)
        {
           res[i]=nums[i-1]*res[i-1];
        }
        int add=nums[n-1];
        for(int k=n-2;k>=0;k--)
        {
            res[k]*=add;
            add*=nums[k];
        }
        return res;
    }
}