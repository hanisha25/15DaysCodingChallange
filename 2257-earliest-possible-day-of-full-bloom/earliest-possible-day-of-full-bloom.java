class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n=plantTime.length;
        int[][] pg=new int[n][2];
        for(int i=0;i<n;i++)
        {
            pg[i][0]=plantTime[i];
            pg[i][1]=growTime[i];
        }
        Arrays.sort(pg,(a,b)->(b[1]-a[1]));
        int days=pg[0][0]+pg[0][1];
        int prevplant=pg[0][0];
        for(int i=1;i<n;i++)
        {
            int curDays=prevplant+pg[i][0]+pg[i][1];
            days=Math.max(days,curDays);
            prevplant+=pg[i][0];
        }
        return days;
    }
}