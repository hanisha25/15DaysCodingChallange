class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] str=path.split("/");
        for(int i=0;i<str.length;i++)
        {
            String s=str[i];
            if(s.equals(".."))
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else if(s.equals(".")||s.equals(""))
            {
            }
            else
            {
                st.push(s);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(st.size()>0)
        {
            ans.insert(0,"/"+st.pop());
        }
        if(ans.length()==0)
        {
            return "/";
        }
        return ans.toString();
    }
}