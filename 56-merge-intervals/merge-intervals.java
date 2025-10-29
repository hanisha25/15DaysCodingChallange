class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] cur=intervals[0];
        List<int[]> list=new ArrayList<int[]>();
        for(int i=1;i<intervals.length;i++)
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
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}