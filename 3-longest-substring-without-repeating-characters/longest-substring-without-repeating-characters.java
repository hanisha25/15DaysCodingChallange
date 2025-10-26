class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest=0;
        int left=0,right=0,n=s.length();
        HashSet<Character> set=new HashSet<>();
        while(right<n)
        {
            while(left<right && set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            longest=Math.max(longest,right-left+1);
            right++;
        }
        return longest;
    }
}