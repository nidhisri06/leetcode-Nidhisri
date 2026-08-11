// Last updated: 11/08/2026, 14:15:11
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if( !st.isEmpty() && c==st.peek())
              st.pop();
            else 
               st.push(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st)
             sb.append(ch);
             return sb.toString(); 
        
    }
}