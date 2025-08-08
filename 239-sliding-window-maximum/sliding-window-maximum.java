class Solution {
    static class Pair implements Comparable<Pair>
    {
        int idx,val;
        Pair(int idx,int val)
        {
            this.idx=idx;
            this.val=val;
        }
        @Override
        public int compareTo(Pair p2)
        {
            return p2.val-this.val;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0||k==0)
        {
            return nums;
        }
        int[] res=new int[nums.length-k+1];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(new Pair(i,nums[i]));
        }
        res[0]=pq.peek().val;
        for(int i=k;i<nums.length;i++)
        {
            while(pq.size()>0 && pq.peek().idx<=(i-k))
            {
               pq.remove();
            }
            pq.add(new Pair(i,nums[i]));
            res[i-k+1]=pq.peek().val;
        }
        return res;
    }
}