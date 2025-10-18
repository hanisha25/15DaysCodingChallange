class Solution {
    public int countNicePairs(int[] nums) {
        int count=0;
        int mod = 1000000007;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            String rev = new StringBuilder(String.valueOf(nums[i])).reverse().toString();
            int value=nums[i]-Integer.valueOf(rev);
            if(map.containsKey(value))
            {
                count = (count + map.get(value)) % mod;
            }
            map.put(value,map.getOrDefault(value,0)+1);
        }
        return count%mod;
    }
}