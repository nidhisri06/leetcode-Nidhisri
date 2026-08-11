// Last updated: 11/08/2026, 14:16:01
class Solution {
    public void reverseString(char[] s) {
        int S=0,E=s.length-1;
        while(S<E)
        {
            char temp=s[S];
        s[S]=s[E];
        s[E]=temp;
        S++;
        E--;
        }  
        for(int i=0;i<s.length;i++)  
        System.out.print(s[i]+" ");  
    }
}