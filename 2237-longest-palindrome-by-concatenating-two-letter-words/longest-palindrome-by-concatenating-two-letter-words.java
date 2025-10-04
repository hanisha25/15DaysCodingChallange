class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        boolean same=false; 
        int len = 0;
        for (String w : map.keySet()) {
            int c=map.getOrDefault(w,0);
            if(c==0) continue;
            String r = new StringBuilder(w).reverse().toString();
            if(w.equals(r))
            {
                 int pairs=c/2;
                 len+=pairs*4; 
                 if (c % 2 == 1) same = true;
            }
            else if(w.compareTo(r)<0)
            {
                int cr = map.getOrDefault(r, 0);
                int pairs = Math.min(c, cr);
                len += pairs * 4;
            }
        }
        if (same) len+=2;
        return len;
    }
}