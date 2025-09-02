class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (split(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean split(int[] nums, int k, int minmized_sum) {
        int count = 1;
        int sum = 0;
        for (int n : nums) {
            if (n > minmized_sum)
                return false;
            sum += n;
            if(sum>minmized_sum)
            {
                count++;
                sum=n;
            }
        }
        return count<=k;
    }
}