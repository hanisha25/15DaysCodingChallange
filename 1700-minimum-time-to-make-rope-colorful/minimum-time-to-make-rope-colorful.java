class Solution {
    public int minCost(String colors, int[] neededTime) {
        int remove=0;
        int n=colors.length();
        int i=0;
        while(i<n)
        {
            int max=0;
            char ch=colors.charAt(i);
            while(i<n && ch==colors.charAt(i))
            {
               remove+=neededTime[i];
                max=Math.max(max,neededTime[i]);
                i++;
            }
            remove-=max;
        }
        return remove;
    }
}