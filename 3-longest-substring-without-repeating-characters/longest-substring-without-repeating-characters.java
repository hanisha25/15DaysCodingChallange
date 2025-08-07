class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hm=new HashSet<>();
        int i=0,j=0,ans=0;
        while(j<s.length())
        {
            char c=s.charAt(j);
            while(hm.contains(c) && i<=j){
                hm.remove(s.charAt(i));
                i++;
            }
            hm.add(c);
            ans=Math.max(ans,hm.size());
            j++;
        }
        return ans;
    }
}