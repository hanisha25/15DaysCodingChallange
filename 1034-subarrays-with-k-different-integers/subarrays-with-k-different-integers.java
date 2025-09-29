class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarrays(nums,k)-subarrays(nums,k-1);
    }
    public int subarrays(int[] nums,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int low=0,high=0,count=0;
        while(high<nums.length)
        {
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            while(map.size()>k)
            {
                map.put(nums[low],map.get(nums[low])-1);
                if(map.get(nums[low])==0)
                {
                    map.remove(nums[low]);
                }
                low++;
            }
            count+=(high-low)+1;
            high++;
        }
        return count;
    }
}