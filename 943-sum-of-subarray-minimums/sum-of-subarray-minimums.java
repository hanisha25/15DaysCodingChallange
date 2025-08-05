class Solution {
    public int sumSubarrayMins(int[] arr) {
        long min=0;
        int mod=1000000007;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=arr.length;i++)
        {
            int el=i<arr.length?arr[i]:Integer.MIN_VALUE;
            while(!st.isEmpty() && arr[st.peek()]>=el)
            {
                int mid=st.pop();
                int left=st.isEmpty()?-1:st.peek();
                int right=i;
                int contribution=(mid-left)*(i-mid);
                min = (min + ((long) arr[mid] * contribution) % mod) % mod;
            }
            st.push(i);
        }
        return (int)min;
    }
}