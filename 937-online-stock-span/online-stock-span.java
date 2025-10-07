class StockSpanner {
    class Info{
        int val;
        int idx;
        Info(int val,int idx)
        {
            this.val=val;
            this.idx=idx;
        }
    }
    Stack<Info> st;
    int i;
    public StockSpanner() {
        st=new Stack<Info>();
        i=1;
    }
    public int next(int price) {
       while(!st.isEmpty() && st.peek().val<=price)
       {
           st.pop();
       }
       int val=st.isEmpty()?i:i-st.peek().idx;
       st.push(new Info(price,i));
      i++;
      return val;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */