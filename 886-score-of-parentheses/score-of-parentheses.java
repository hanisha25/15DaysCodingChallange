class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                st.push(0);
            }
            else
            {
                int cur=st.pop();
                int val=(cur==0)?1:2*cur;
                st.push(st.pop()+val);
            }
        }
        return st.pop();
    }
}