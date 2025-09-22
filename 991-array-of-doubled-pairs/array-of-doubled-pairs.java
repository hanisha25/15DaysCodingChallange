class Solution {
    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
         Arrays.sort(arr);
        for(int n:arr)
        {
             if (!map.containsKey(n)) continue;
            if(map.containsKey(2*n))
            {
                map.put(n,map.getOrDefault(n,0)-1);
                if(map.get(n)==0)
                {
                    map.remove(n);
                }
                map.put(2*n,map.getOrDefault(2*n,0)-1);
                if(map.get(2*n)==0)
                {
                    map.remove(2*n);
                }
            }
        }
        return map.size()==0;
    }
}