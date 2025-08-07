class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans+1;
    }
}