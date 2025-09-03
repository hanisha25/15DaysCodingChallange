class Solution {
    List<String> res;

    public List<String> addOperators(String num, int target) {
        res = new ArrayList<>();
        rec(num, target, new StringBuilder(), 0, 0, 0);
        return res;
    }

    public void rec(String num, int target, StringBuilder sb, int idx, long sum, long last) {
        if (idx == num.length()) {
            if (sum == target) {
                res.add(sb.toString());
            }
            return;
        }
        for (int i = idx; i < num.length(); i++) {
            if (i != idx && num.charAt(idx) == '0')
                break;
            long curr = Long.parseLong(num.substring(idx, i + 1));
            int len = sb.length();
            if (idx == 0) {
                sb.append(curr);
                rec(num, target, sb, i + 1, curr, curr);
                sb.setLength(len);
            }
            else{
            sb.append("+").append(curr);
                rec(num, target, sb, i + 1, sum + curr, curr);
                sb.setLength(len);

                sb.append("-").append(curr);
                rec(num, target, sb, i + 1, sum - curr, -curr);
                sb.setLength(len);

                sb.append("*").append(curr);
                rec(num, target, sb, i + 1, sum - last + last * curr, last * curr);
                sb.setLength(len);
            }
        }
    }
}