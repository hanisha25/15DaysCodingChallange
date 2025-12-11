class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
           if(nums[i]<nums[i+1])
           {
            pivot=i;
            break;
           }
        }
        if(pivot==-1)
        {
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--)
        {
            if(nums[pivot]<nums[i])
            {
                int temp=nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse(nums,pivot+1,n-1);
    }
    public void reverse(int[] nums,int low,int high)
    {
        while(low<high)
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}