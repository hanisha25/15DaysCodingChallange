class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int t:tasks)
        {
           map.put(t,map.getOrDefault(t,0)+1);
        }
        int days=0;
        for(int key:map.values())
        {
           if(key==1) return -1;
           if(key%3==0)
           {
             days+=(key/3);
           }
           else
           {
            days+=(key/3+1);
           }
           
        }
        return days;
    }
}