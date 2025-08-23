class Solution {
    public int singleNumber(int[] nums) {
        int value=0;
        for(int n:nums)
        {
            value^=n;
        }
        return value;
    }
}