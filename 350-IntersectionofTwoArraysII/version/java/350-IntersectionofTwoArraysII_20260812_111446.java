// Last updated: 12/08/2026, 11:14:46
1class MyStack 
2{
3    Queue<Integer> o;
4    Queue<Integer> p;
5    public MyStack() 
6    {
7        o = new ArrayDeque<>();
8        p = new ArrayDeque<>();
9    }
10    
11    public void push(int x) 
12    {
13        o.add(x);
14    }
15    
16    public int pop() 
17    {
18        if(o.isEmpty())
19        {
20            return -1;
21        }
22        while (o.size() > 1) 
23        {
24            p.add(o.remove());
25        }
26        int f = o.remove();
27        while(!p.isEmpty())
28        {
29            o.add(p.remove());
30        }
31        return f;
32    }
33    
34    public int top() 
35    {
36        if(o.isEmpty())
37        {
38            return -1;
39        }
40        while (o.size() > 1) 
41        {
42            p.add(o.remove());
43        }
44        int f = o.remove();
45        p.add(f);
46        while(!p.isEmpty())
47        {
48            o.add(p.remove());
49        }
50        return f;
51    }
52    
53    public boolean empty() 
54    {
55        if(o.isEmpty())
56        {
57            return true;
58        }
59        return false;
60    }
61}
62
63/**
64 * Your MyStack object will be instantiated and called as such:
65 * MyStack obj = new MyStack();
66 * obj.push(x);
67 * int param_2 = obj.pop();
68 * int param_3 = obj.top();
69 * boolean param_4 = obj.empty();
70 */