// Last updated: 12/08/2026, 11:15:57
1class MyQueue {
2    private Stack<Integer> first;
3    private Stack<Integer> second;
4
5    public MyQueue() {
6        first = new Stack<>();
7        second = new Stack<>();
8    }
9
10    public void push(int x) {
11        first.push(x); // Always push into first stack
12    }
13
14    public int pop() {
15        // Transfer elements only when second is empty
16        if (second.isEmpty()) {
17            while (!first.isEmpty()) {
18                second.push(first.pop()); // Move elements from first to second
19            }
20        }
21
22        return second.pop(); // Front element of the queue
23    }
24
25    public int peek() {
26        // Transfer elements only when second is empty
27        if (second.isEmpty()) {
28            while (!first.isEmpty()) {
29                second.push(first.pop()); // Move elements from first to second
30            }
31        }
32
33        return second.peek(); // Front element of the queue
34    }
35
36    public boolean empty() {
37        return first.isEmpty() && second.isEmpty();
38    }
39}