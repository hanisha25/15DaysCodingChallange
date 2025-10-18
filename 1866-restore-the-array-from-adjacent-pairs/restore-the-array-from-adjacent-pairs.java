class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int[] a : adjacentPairs) {
            map.computeIfAbsent(a[0], k -> new ArrayList<>()).add(a[1]);
            map.computeIfAbsent(a[1], k -> new ArrayList<>()).add(a[0]);
        }
        int start = 0;
        for (int key : map.keySet()) {
            if (map.get(key).size() == 1) {
                start = key;
                break;
            }
        }
        int n = adjacentPairs.length + 1;
        int[] res = new int[n];
        HashSet<Integer> set = new HashSet<>();
        set.add(start);
        res[0] = start;
        for (int i = 1; i < n; i++) {
            int key = res[i - 1];
            List<Integer> neigh = map.get(key);
            for (int ne : neigh) {
                if (!set.contains(ne)) {
                    res[i] = ne;
                    set.add(ne);
                }
            }
        }
        return res;
    }
}