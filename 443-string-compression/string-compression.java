class Solution {
    public int compress(char[] chars) {
        int i = 0, n = 0;
        int j = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int count = 1;
             j = i + 1;
            while (j < chars.length && ch == chars[j]) {
                j++;
                count++;
            }
            chars[n++] = chars[i];
            if (count > 1) {
                char[] nums = String.valueOf(count).toCharArray();
                for(int k=0;k<nums.length;k++)
                {
                    chars[n++]=nums[k];
                }
            }
            i=j;

        }
        return n;
    }
}