class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        if(n<k) return res;
        long[] prefix=new long[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
           prefix[i]=prefix[i-1]+nums[i];
        }
        int i=k;
        while(i<n)
        {
            int left=i-k;
            int right=i+k;
            if(right>=n) break;
            long sum=prefix[right]-(left>0?prefix[left-1]:0);
            res[i]=(int)(sum/(right-left+1));
            i++;
        }
        return res;
    }
}