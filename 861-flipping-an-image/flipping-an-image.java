class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                
                if(image[i][j]==1)
                {
                    res[i][j]=0;
                }
                else
                {
                    res[i][j]=1;
                }
            }
            reverseArray(res[i]);
        }
        return res;
    }
    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}