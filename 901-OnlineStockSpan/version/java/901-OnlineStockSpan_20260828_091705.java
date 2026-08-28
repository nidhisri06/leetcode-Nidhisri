// Last updated: 28/08/2026, 09:17:05
1class Solution {
2    public boolean validateStackSequences(int[] pushed, int[] popped) {
3        Stack<Integer> st = new Stack<>(); // Create a stack
4        
5        int j = 0; // Intialise one pointer pointing on popped array
6        
7        for(int val : pushed){
8            st.push(val); // insert the values in stack
9            while(!st.isEmpty() && st.peek() == popped[j]){ // if st.peek() values equal to popped[j];
10                st.pop(); // then pop out
11                j++; // increment j
12            }
13        }
14        return st.isEmpty(); // check if stack is empty return true else false
15    }
16}