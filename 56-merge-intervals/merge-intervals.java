class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int[] cur=intervals[0];
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            if(intervals[i][0]<=cur[1])
            {
                cur[1]=Math.max(cur[1],intervals[i][1]);
            }
            else
            {
                list.add(cur);
                cur=intervals[i];
            }
        }
        list.add(cur);
        int[][] res=new int[list.size()][2];
        list.toArray(res);
        return res;
    }
}