class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>(
            (a,b)->map.get(b)-map.get(a)
        );
        pq.addAll(map.keySet());
        if(map.get(pq.peek()) > (n+1)/2) return "";
        char[] res = new char[n];
        int idx = 0;

        while (!pq.isEmpty()) {
            char ch = pq.poll();
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                if (idx >= n) idx = 1; 
                res[idx] = ch;
                idx += 2;
            }
        }
        return new String(res);
    }
}