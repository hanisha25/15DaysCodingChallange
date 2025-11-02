class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String cur=new String(ch);
            map.put(cur,map.getOrDefault(cur,new ArrayList<String>()));
            List<String> l=map.get(cur);
            l.add(s);
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> list:map.values())
        {
            res.add(list);
        }
        return res;
    }
}