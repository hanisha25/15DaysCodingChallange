class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] res=new int[queries.length];
        HashMap<Integer,Integer> ballColor=new HashMap<>();
        HashMap<Integer,Integer> colorCount=new HashMap<>();
        int i=0;
        for(int[] q:queries)
        {
            int x=q[0],c=q[1];
            if(ballColor.containsKey(x))
            {
                int prev=ballColor.get(x);
                colorCount.put(prev, colorCount.get(prev) - 1);
                if (colorCount.get(prev) == 0) {
                    colorCount.remove(prev);
                }
            }
            ballColor.put(x,c);
            colorCount.put(c, colorCount.getOrDefault(c, 0) + 1);
            res[i++]=colorCount.size();
        }
        return res;
    }
}