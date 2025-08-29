class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        if(s.length()<10)
        {
            return list;
        }
        HashSet<String> set=new HashSet<>();
        int j=9;
        int i=0;
        while(j<s.length())
        {
            String str=s.substring(i,j+1);
            if(set.contains(str) && !list.contains(str))
            {
                list.add(str);
            }
            else
            {
                set.add(str);
            }
            i++;
            j++;
        }
        return list;
    }
}