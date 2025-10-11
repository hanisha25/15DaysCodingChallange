class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] res = new int[queries.length];
        int even = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                even += n;
            }
        }
        int k = 0;
        for (int[] q : queries) {
            int val = q[0], idx = q[1];
            if (nums[idx] % 2 == 0) {
                even -= nums[idx];
            }
            nums[idx] += val;
            if (Math.abs(nums[idx] % 2) == 0) {
                even += nums[idx];
            }
            res[k++] = even;
        }
        return res;
    }
}