class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count=0;
        int[] cur=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<cur[1])
            {
                count++;
            }
            else
            {
                cur=intervals[i];
            }
        }
        return count;
    }
}