class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashSet<Character> set=new HashSet<>();
        int max=1;
        int left=0,right=0;
        while(right<s.length())
        {
            char ch=s.charAt(right);
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            max=Math.max(max,right-left+1);
            set.add(ch);
            right++;
        }
        return max;
    }
}