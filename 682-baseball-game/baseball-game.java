class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack();
        for(String op:operations)
        {
            if(op.equals("+"))
            {
                int a=st.pop();
                int sum=(a+st.peek());
                st.push(a);
                st.push(sum);
            }
            else if(op.equals("D"))
            {
                st.push(2*st.peek());
            }
            else if(op.equals("C"))
            {
                st.pop();
            }
            else
            {
                int num=Integer.valueOf(op);
                st.push(num);
            }
        }
       int sum = 0;
        while(!st.empty()) {
            sum += st.pop();
        }
        return sum;
    }
}