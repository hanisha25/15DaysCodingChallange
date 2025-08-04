class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs)
        {
            char[] ch=st.toCharArray();
            Arrays.sort(ch);
            String newStr=new String(ch);
            if(!map.containsKey(newStr))
            {
                map.put(newStr,new ArrayList<>());
            }
            map.get(newStr).add(st);
        }
        for(String str:map.keySet())
        {
            res.add(map.get(str));
        }
        return res;
    }
}