class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int n:nums1)
        {
            map1.put(n,map1.getOrDefault(n,0)+1);
        }
        for(int n:nums2)
        {
            map2.put(n,map2.getOrDefault(n,0)+1);
        }
        for(int n:map1.keySet())
        {
            if(map2.containsKey(n)) {
                int freq = Math.min(map1.get(n), map2.get(n));
                while(freq-- > 0) {
                   list.add(n);
                }
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}