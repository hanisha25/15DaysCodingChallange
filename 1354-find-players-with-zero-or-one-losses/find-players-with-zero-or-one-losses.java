class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++)
        {
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> win=new ArrayList<>();
        List<Integer> win_1=new ArrayList<>();
        for(int[] m:matches)
        {
            int w=m[0];
            int loss=m[1];
            if(!map.containsKey(w))
            {
                win.add(w);
                map.put(w,2);
            }
            if(map.get(loss)==1)
            {
                win_1.add(loss);
            }
        }
        Collections.sort(win);
        Collections.sort(win_1);
        return Arrays.asList(win,win_1);
    }
}