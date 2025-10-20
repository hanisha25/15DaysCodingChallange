class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0) return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int h:hand)
        {
            map.put(h,map.getOrDefault(h,0)+1);
        }
        for(int h:map.keySet())
        {
            pq.add(h);
        }
        while(!pq.isEmpty())
        {
            int start=pq.peek();
            for(int i=0;i<groupSize;i++)
            {
                int s=start+i;
                if(!map.containsKey(s))
                {
                     return false;
                }
                map.put(s,map.get(s)-1);
                if(map.get(s)==0) { 
                    map.remove(s); 
                    pq.remove(s);
                }
            }
        }
        return true;
    }
}