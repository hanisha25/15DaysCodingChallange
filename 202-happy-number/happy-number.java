class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hm=new HashSet<>();
        int value=n;
        while(value!=1)
        {
            int temp=value;
            value=0;
            while(temp>0)
            {
                int cur=temp%10;
                value+=Math.pow(cur,2);
                temp=temp/10;
            }
            if(hm.contains(value)) return false;
            hm.add(value);
        }
        return true;
    }
}