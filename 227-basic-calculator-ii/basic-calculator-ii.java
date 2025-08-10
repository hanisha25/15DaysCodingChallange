class Solution {
    public int calculate(String s) {
    Stack<Integer> st=new Stack<>();
    int num=0;
    char operator='+';
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(Character.isDigit(ch))
        {
            num=(num*10)+(ch-'0');
        }
        if((!Character.isDigit(ch) && ch!=' ') || (i==(s.length()-1)))
        {
            if(operator=='+')
            {
               st.push(num); 
            }
            else if(operator=='-')
            {
               st.push(-1*num); 
            }
            else if(operator=='*')
            {
               st.push(num*st.pop()); 
            }
            else if(operator=='/')
            {
               st.push(st.pop()/num); 
            }
            num=0;
            operator=ch;
        }
    }
        int sum=0;
        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        return sum;
    }
}