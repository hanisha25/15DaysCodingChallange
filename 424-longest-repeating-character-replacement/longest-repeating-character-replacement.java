class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq=new int[26];
       int low=0,window_size=0,max_freq=0;
       int ans=0;
       for(int high=0;high<s.length();high++)
       {
            freq[s.charAt(high)-'A']++;
            max_freq=Math.max(max_freq,freq[s.charAt(high)-'A']);
            while((high-low+1)-max_freq>k)
            {
                freq[s.charAt(low)-'A']--;
                low++;
            }
            window_size=high-low+1;
            ans=Math.max(window_size,ans);
       }
       return ans;
    }
}