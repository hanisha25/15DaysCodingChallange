class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int a:nums)
        {
            sum+=a;
        }
        int miss=(n*(n+1)/2)-sum;
        return miss;
    }
}