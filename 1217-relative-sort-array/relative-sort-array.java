class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        int[] res=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++)
        {
            int rep=map.get(arr2[i]);
            for(int r=0;r<rep;r++)
            {
                res[k++]=arr2[i];
            }
            map.remove(arr2[i]);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int key:map.keySet())
        {
            pq.add(key);
        }
        while(!pq.isEmpty())
        {
            int cur=pq.remove();
            for(int r=0;r<map.get(cur);r++)
            {
                res[k++]=cur;
            }
        }
        return res;
    }
}