class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,count=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            if(sum==k) count++;
            int target=sum-k;
            if(map.containsKey(target))
            {
                count+=map.get(target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}