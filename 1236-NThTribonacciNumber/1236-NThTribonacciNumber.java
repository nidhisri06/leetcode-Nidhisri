// Last updated: 11/08/2026, 14:15:08
class Solution {
    public int tribonacci(int n) {
        int n1=0;
        int n2=1;
        int n3=1;
        if (n==0)
         return 0;
        if(n==1)
         return 1;
         if(n==2)
         return 1;
        int n4=0;
        for(int i=3;i<=n;i++){
            n4 =n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
        }
        return n4; 
        
    }
}