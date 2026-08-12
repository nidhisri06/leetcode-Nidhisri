// Last updated: 12/08/2026, 17:51:57
1class Solution {
2    public boolean isValid(String code) {
3        
4        Stack<String> stack = new Stack<>(); // TAG_NAME is pushed to stack
5        
6        for(int i = 0; i < code.length();){
7            
8            if(i > 0 && stack.isEmpty()) // No TAG_NAME found in the beginning 
9                return false;
10            
11            // <![CDATA[ begin for <![CDATA[CDATA_CONTENT]]>
12            if(code.startsWith("<![CDATA[", i)){
13                int j = i + 9;
14                i = code.indexOf("]]>", j);
15                if(i < 0) //if not found "]]>"
16                    return false;
17                i += 3;
18            }
19            
20            // </TAG_NAME> end
21            else if(code.startsWith("</", i)){
22                int j = i + 2;
23                i = code.indexOf('>', j);
24                if(i < 0 || i == j || i - j > 9) 
25                    return false;
26                for(int k = j; k < i; k++){
27                    if(!Character.isUpperCase(code.charAt(k)))  // TAG_NAME only contains upper-case letters
28                        return false;
29                }
30                String s = code.substring(j, i++);
31                if(stack.isEmpty() || !stack.pop().equals(s)) // TAG_NAME doesn't match
32                    return false;
33            }
34            
35            // <TAG_NAME> begin
36            else if(code.startsWith("<", i)){
37                int j = i + 1;
38                i = code.indexOf('>', j);
39                if(i < 0 || i == j || i - j > 9) 
40                    return false;
41                for(int k = j; k < i; k++){
42                    if(!Character.isUpperCase(code.charAt(k))) // TAG_NAME only contains upper-case letters
43                        return false;
44                }
45                String s = code.substring(j, i++);
46                stack.push(s);
47            }
48            
49            // All other characters
50            else{
51                i++;
52            }
53        }
54        return stack.isEmpty();
55    }
56}