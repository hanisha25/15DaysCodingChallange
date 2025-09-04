class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] p : people) {
            int idx = p[1];
            list.add(idx, p);

        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < people.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}