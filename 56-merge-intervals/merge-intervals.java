class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(intervals.length<=1)
        {
            return intervals;
        }
         Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0])); 
        List<int[]> list=new ArrayList<int[]>();
        int[] interval=intervals[0];
        list.add(interval);
        for(int i=1;i<n;i++)
        {
            if(interval[1]>=intervals[i][0])
            {
                interval[1]=Math.max(interval[1],intervals[i][1]);
            }
            else
            {
                interval=intervals[i];
                list.add(interval);
            }
        }
        int[][] res=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}