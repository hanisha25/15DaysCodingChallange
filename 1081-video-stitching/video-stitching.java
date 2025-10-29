class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips,(a,b)->Integer.compare(a[0],b[0]));
        int i=0,n=clips.length,start=0,farthest=0,count=0;
        while(start<time)
        {
            while(i<n && clips[i][0]<=start)
            {
                farthest=Math.max(farthest,clips[i][1]);
                i++;
            }
            if (farthest == start) return -1;
            start=farthest;
            count++;
        }
        return count;
    }
}