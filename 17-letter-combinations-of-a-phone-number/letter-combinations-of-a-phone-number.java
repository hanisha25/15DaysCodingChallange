class Solution {
    List<String> res;
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        res=new ArrayList<>();
        if(digits.length()==0)
          return res;
        rec(digits,0,"");
        return res;
    }
    public void rec(String digits,int idx,String ans)
    {
        if(idx==digits.length())
        {
            res.add(ans);
            return;
        }
        char ch=digits.charAt(idx);
        int num=ch-'0';
        String st=map[num];
        for(int i=0;i<st.length();i++)
        {
            rec(digits,idx+1,ans+st.charAt(i));
        }
    }
}