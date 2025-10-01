class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n=arr.length;
        int[] rem=new int[k];
        for(int x:arr)
        {
            int r=((x%k)+k)%k;
            rem[r]++;
        }
        if(rem[0]%2!=0) return false;
        for(int i=1;i<=k/2;i++)
        {
            if(rem[i]!=rem[k-i])
            {
                return false;
            }
        }
        return true;
    }
}