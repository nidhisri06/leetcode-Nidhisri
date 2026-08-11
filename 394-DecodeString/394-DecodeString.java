// Last updated: 11/08/2026, 14:15:55
class Solution {
    public String decodeString(String str) {
        Stack<Integer> numSt = new Stack<>();
        Stack<String> st = new Stack<>();
        int n=0;
        String s = "";
        for(char c: str.toCharArray()){
            if(Character.isDigit(c))
                n=n*10+c-'0';
            else if(Character.isAlphabetic(c))
                s+=c;
            else if(c=='['){
                numSt.push(n);
                st.push(s);
                n=0;
                s="";
            }else{
                StringBuilder temp=new StringBuilder();
                int t = numSt.pop();
                for(int i=0;i<t;i++)
                    temp.append(s);
                s = st.pop() + temp.toString();
            }
        }
        return s;
        
    }
}