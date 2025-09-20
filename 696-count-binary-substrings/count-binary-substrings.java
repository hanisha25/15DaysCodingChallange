class Solution {
    public int countBinarySubstrings(String s) {
        if(s.length()==1) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
               list.add(count);
               count=1;
            }
        }
        list.add(count);
        int sum=0;
        for(int i=1;i<list.size();i++)
        {
           sum+=Math.min(list.get(i-1),list.get(i));
        }
        return sum;
    }
}