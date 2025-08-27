class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = "" + nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            String x = a + b;
            String y = b + a;
            if (x.compareTo(y) < 0) {
                return 1;
            } else if (x.compareTo(y) > 0) {
                return -1;
            } else {
                return 0;
            }
        });
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