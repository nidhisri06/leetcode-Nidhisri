// Last updated: 28/08/2026, 09:16:16
1class StockSpanner {
2    Stack<int[]> st;
3    public StockSpanner() {
4        st = new Stack<>();
5    }
6    public int next(int price) {
7        int span = 1;
8        while (!st.isEmpty() && st.peek()[0] <= price) {
9            span += st.pop()[1];
10        }
11        st.push(new int[] {price, span});
12        return span;
13    }
14}