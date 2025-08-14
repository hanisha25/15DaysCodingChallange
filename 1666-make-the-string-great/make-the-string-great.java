class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
       for(char c:s.toCharArray())
       {
            if(st.isEmpty()) st.push(c);
            else {
                int v1=st.peek();
                int v2=c;
                if(Math.abs(v1-v2)==32)
                {
                    st.pop();
                }
                else
                {
                    st.push(c);
                }
            }
       }
       StringBuilder sb=new StringBuilder("");
       while(!st.isEmpty())
       {
          sb.insert(0,st.pop());
       }
       return sb.toString();
    }
}