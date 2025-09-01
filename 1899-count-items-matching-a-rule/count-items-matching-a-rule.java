class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx=0;
        int count=0;
        if(ruleKey.equals("color"))
        {
           idx=1;
        }
        else if(ruleKey.equals("name"))
        {
            idx=2;
        }
        for(List<String> list:items)
        {
            if(list.get(idx).equals(ruleValue))
            {
                count++;
            }
        }
        return count;
    }
}