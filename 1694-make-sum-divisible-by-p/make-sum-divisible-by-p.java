class Solution {
    public int minSubarray(int[] nums, int p) {
        int n=nums.length;
        long total=0;
        for(int el:nums) 
        {
            total+=el;
        }
        int rem=(int)(total%p);
        if(rem==0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, -1);
        long prefix=0;
        int minLen=n;
        for(int i=0;i<n;i++)
        {
            prefix+=nums[i];
            int cur=(int)(prefix%p);
            int target=(cur-rem+p)%p;
            if(map.containsKey(target))
            {
                minLen=Math.min(minLen,i-map.get(target));
            }
            map.put(cur,i);
        }
        return minLen==n?-1:minLen;
    }
}