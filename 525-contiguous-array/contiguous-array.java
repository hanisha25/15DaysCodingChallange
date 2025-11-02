class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,len=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            sum+=(nums[i]==0)?-1:1;
            if(sum==0) len=i+1;
            else if(map.containsKey(sum))
            {
                len=Math.max(len,i-map.get(sum));
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
        }
        return len;
    }
}