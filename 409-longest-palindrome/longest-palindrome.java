class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean odd=false;
        for(int v:map.values())
        {
            if(v%2==0)
            {
                length+=v;
            }
            else
            {
                length+=(v-1);
                odd=true;
            }
        }
        if(odd) length++;
        return length;
    }
}