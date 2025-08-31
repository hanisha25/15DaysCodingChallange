class Solution {
    List<String> par;
    int total;
    public List<String> generateParenthesis(int n) {
        total=n;
        par=new ArrayList<>();
        rec(0,0,"");
        return par;
    }
    public void rec(int open,int close,String st)
    {
        if(st.length()==(2*total))
        {
            par.add(st);
            return;
        }
        if(open<total)
        {
            rec(open+1,close,st+"(");
        }
        if(close<open)
        {
            rec(open,close+1,st+")");
        }
    }
}