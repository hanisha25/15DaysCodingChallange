class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        ArrayList<Integer> freeSpace=new ArrayList<Integer>();
        freeSpace.add(startTime[0]);
        for(int i=1;i<startTime.length;i++)
        {
            int space=startTime[i]-endTime[i-1];
            freeSpace.add(space);
        }
        freeSpace.add(eventTime-endTime[endTime.length-1]);
        int window=k+1;
        int low=0,high=0;
        int max=0,sum=0;
        while(high<freeSpace.size())
        {
            sum+=freeSpace.get(high);
            if((high-low+1)>window)
            {
                sum-=freeSpace.get(low);
                low++;
            }
            high++;
            max=Math.max(max,sum);
        }
        return max;
    }
}