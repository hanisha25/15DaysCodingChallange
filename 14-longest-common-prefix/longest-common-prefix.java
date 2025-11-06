class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length-1;
        StringBuilder sb=new StringBuilder("");
        int i=0,j=0;
        while(i<strs[0].length() && j<strs[n].length())
        {
            if(strs[0].charAt(i)!=strs[n].charAt(j))
            {
                return sb.toString();
            }
            else
            {
                sb.append(strs[0].charAt(i));
            }
            i++;
            j++;
        }
        return sb.toString();
    }
}