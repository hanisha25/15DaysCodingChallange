class Solution {
    public int minDeletions(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        HashSet<Integer> map=new HashSet<>();
        int del=0;
        for(int f:freq)
        {
            if(f==0) continue;
            while(map.contains(f))
            {
               f--;
               del++;
            }
            if(f!=0){
            map.add(f);
            }
        }
        return del;
    }
}