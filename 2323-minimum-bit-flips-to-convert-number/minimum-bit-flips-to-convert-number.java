class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        while(start>0 || goal>0)
        {
            int result = (start & 1) ^ (goal & 1);
            count+=result;
            start=start>>1;
            goal=goal>>1;
        }
        return count;
    }
}