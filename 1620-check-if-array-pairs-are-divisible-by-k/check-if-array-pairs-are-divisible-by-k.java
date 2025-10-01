class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr)
        {
            int key=((a % k) + k) % k;
            map.put(key,map.getOrDefault(key,0)+1);
        }
        if (map.getOrDefault(0, 0) % 2 != 0) {
            return false;
        }
        for(int i=1;i<=(k/2);i++)
        {
            if(i==k-i)
            {
                if(map.getOrDefault(i,0)%2!=0) return false;
            }
            else{
            if (!map.getOrDefault(i, 0).equals(map.getOrDefault(k-i, 0)))
            {
                return false;
            }
            }
        }
        return true;
    }
}