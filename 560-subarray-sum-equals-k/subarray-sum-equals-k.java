class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int n:nums)
        {
            sum+=n;
            if(sum==k) count++;
            int target=sum-k;
            if(map.containsKey(target))
            {
                count+=(map.get(target));
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}