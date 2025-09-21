class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)
        {
            return 0;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;
        int prev=0;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=intervals[prev][1])
            {
                count++;
                prev=i;
            }
        }
        return intervals.length-count;
    }
}