class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = "" + nums[i];
        }
        Arrays.sort(arr, (a, b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for (String st : arr) {
            sb.append(st);
        }
        if(sb.length()==0 || sb.charAt(0)=='0')
        {
            return "0";
        }
        return sb.toString();
    }
}