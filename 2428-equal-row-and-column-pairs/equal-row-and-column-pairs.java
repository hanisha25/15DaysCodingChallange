class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
            map.put(i,grid[i]);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=grid[j][i];
            }
            for(int[] v:map.values())
            {
                if(Arrays.equals(v,arr))
                {
                    count++;
                }
            }
        }
        return count;
    }
}