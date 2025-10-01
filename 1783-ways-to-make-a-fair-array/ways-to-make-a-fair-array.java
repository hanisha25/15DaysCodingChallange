class Solution {
    public int waysToMakeFair(int[] nums) {
        int n=nums.length;
        int[] evenprefix=new int[n];
        int[] oddprefix=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i>0)
            {
                evenprefix[i]=evenprefix[i-1];
                oddprefix[i]=oddprefix[i-1];
            }
            if(i%2==0)
            {
                evenprefix[i]+=nums[i];
            }
            else
            {
                oddprefix[i]+=nums[i];
            }
        }
        int totalodd=oddprefix[n-1];int totaleven=evenprefix[n-1];
        int count=0;
        for(int i=0;i<n;i++)
        {
            int evenleft=(i>0)?evenprefix[i-1]:0;
            int oddleft=(i>0)?oddprefix[i-1]:0;
            
            int evenright=totalodd-oddprefix[i];
            int oddright=totaleven-evenprefix[i];

            if((evenleft+evenright)==(oddleft+oddright))
            {
                count++;
            }
        }
        return count;
    }
}