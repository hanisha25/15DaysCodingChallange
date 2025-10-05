class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        long[] req=new long[n];
        long sum=0;
        for(int i=0;i<n;i++)
        {
            req[i]=capacity[i]-rocks[i];
            sum+=(capacity[i]-rocks[i]);
        }
        if(sum<=additionalRocks)
        {
            return n;
        }
        Arrays.sort(req);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(req[i]==0)
            {
                count++;
            }
            else if(additionalRocks>=req[i])
            {
               additionalRocks-=req[i];
               count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}