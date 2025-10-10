class Solution {
    public int minSteps(String s, String t) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        for(char ch:t.toCharArray())
        {
            freq[ch-'a']--;
        }
        int count=0;
        for(int f:freq)
        {
            if(f!=0)
            {
                count+=Math.abs(f);
            }
        }
        return count/2;
    }
}