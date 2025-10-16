class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        double ans;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m)
        {
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int s=(arr.length)/2;
       if(arr.length%2==0)
       {
         ans=(arr[s-1]+arr[s])/2.0;
       }
       else
       {
        ans=arr[s];
       }
       return ans;
    }
}