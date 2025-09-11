class Solution {
    int count=0;
    public int countArrangement(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1);
        }
        boolean[] vis=new boolean[n];
        count(arr,vis,1);
        return count;
    }
    public void count(int[] arr,boolean[] vis,int idx)
    {
        if(idx>arr.length)
        {
            count++;
            return;
        }
        for(int i:arr)
        {
            if(vis[i-1]) continue;
            if(i%idx==0 || idx%i==0)
            {
                vis[i-1]=true;
                count(arr,vis,idx+1);
                vis[i-1]=false;
            }
        }
    }
}