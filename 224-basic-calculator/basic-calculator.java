class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int num=0;
        int res=0;
        int sign=1;
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
            }
            else if(ch=='+')
            {
                res+=(sign*num);
                num=0;
                sign=1;
            }
            else if(ch=='-')
            {
               res+=(sign*num);
                num=0;
                sign=-1;
            }
            else if(ch=='(')
            {
                 st.push(res);
                 st.push(sign);
                 res=0;
                 res=0;
                 sign=1;
            }
            else if(ch==')')
            {
                 res+=(sign*num);
                 num=0;
                 int top=st.pop();
                 res*=top;
                 top=st.pop();
                 res+=top;
            }
        }
        res+=(sign*num);
        return res;
    }
}