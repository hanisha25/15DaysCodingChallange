class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, Long> map = new HashMap<>();
        int n = arr.length;
        long mod = 1_000_000_007;
        for (int i = 0; i < n; i++) {
            long ways = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int key = arr[i] / arr[j];
                    if (map.containsKey(key)) {
                        ways += map.get(arr[j]) * map.get(key);
                    }
                }
            }
            map.put(arr[i], ways % mod);
        }
        long count = 0;
        for (long v : map.values()) {
            count=(count+v)%mod;
        }
        return (int)count;
    }
}