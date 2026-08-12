// Last updated: 12/08/2026, 15:13:02
1class Solution {
2    public int calculate(String s) {
3
4        // Stack stores previous result and sign before '('
5        Stack<Integer> stack = new Stack<>();
6
7        // res -> current calculated result
8        // curr -> current number being formed
9        // sign -> current sign (1 for '+', -1 for '-')
10        int res = 0;
11        int curr = 0;
12        int sign = 1;
13
14        // Traverse each character
15        for (char c : s.toCharArray()) {
16
17            // Build multi-digit numbers
18            if (Character.isDigit(c)) {
19                curr = curr * 10 + (c - '0');
20            }
21
22            // Process '+' operator
23            else if (c == '+') {
24                res += curr * sign;
25                sign = 1;
26                curr = 0;
27            }
28
29            // Process '-' operator
30            else if (c == '-') {
31                res += curr * sign;
32                sign = -1;
33                curr = 0;
34            }
35
36            // Start of a new sub-expression
37            else if (c == '(') {
38                stack.push(res);   // Save current result
39                stack.push(sign);  // Save current sign
40
41                // Reset for evaluating expression inside parentheses
42                res = 0;
43                sign = 1;
44                curr = 0;
45            }
46
47            // End of current sub-expression
48            else if (c == ')') {
49                // Finish current expression
50                res += curr * sign;
51                curr = 0;
52
53                // Apply the sign before '('
54                res *= stack.pop();
55
56                // Add the previous result
57                res += stack.pop();
58            }
59
60            // Ignore spaces automatically
61        }
62
63        // Add the last number
64        res += curr * sign;
65
66        return res;
67    }
68}