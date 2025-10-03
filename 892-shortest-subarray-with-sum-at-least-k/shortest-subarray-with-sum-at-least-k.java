class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new LinkedList<Integer>();
        long[] prefix=new long[n];
        int len=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(i==0) prefix[i]=nums[i];
            else prefix[i]=prefix[i-1]+nums[i];
            if(prefix[i]>=k) len=Math.min(i+1,len);
            while(!dq.isEmpty() && (prefix[i]-prefix[dq.peekFirst()]>=k))
            {
                len=Math.min(len,i-dq.peekFirst());
                dq.removeFirst();
            }
            while(!dq.isEmpty() && prefix[dq.peekLast()]>=prefix[i])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        return len==Integer.MAX_VALUE?-1:len;
    }
}