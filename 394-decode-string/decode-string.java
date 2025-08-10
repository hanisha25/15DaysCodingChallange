class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==']')
            {
                StringBuilder temp=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='[')
                {
                   temp.insert(0,st.pop());
                }
                st.pop();
                String repeat=temp.toString();
                temp=new StringBuilder();
                while(!st.isEmpty() && st.peek()>='0'&& st.peek()<='9')
                {
                     temp.insert(0,st.pop());
                }
                int count=Integer.parseInt(temp.toString());
                while(count-->0)
                {
                    for(int j=0;j<repeat.length();j++)
                    {
                       char c=repeat.charAt(j);
                       st.push(c);
                    }
                }
            }
            else
            {
                st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(st.size()>0)
        {
            ans.insert(0,st.pop());
        }
        return ans.toString();
    }
}