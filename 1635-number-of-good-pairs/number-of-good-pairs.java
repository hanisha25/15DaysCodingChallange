class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length,count=0;
        map.put(nums[n-1],1);
        for(int i=n-2;i>=0;i--)
        {
            if(map.containsKey(nums[i]))
            {
                count+=map.get(nums[i]);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}