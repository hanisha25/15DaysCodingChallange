class Solution {
    class Pair{
        char c;
        int count;
        Pair(char c ,int count)
        {
            this.c=c;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(st.isEmpty())
            {
                st.push(new Pair(c,1));
            }
            else
            {
                if(st.peek().c==c)
                {
                    st.peek().count++;
                    if(st.peek().count==k)
                    {
                        st.pop();
                    }
                }
                else
                {
                    st.push(new Pair(c,1));
                }
            }
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty())
        {
            Pair cur=st.pop();
            while(cur.count-->0)
            {
                sb.insert(0,cur.c);
            }
        }
        return sb.toString();
    }
}