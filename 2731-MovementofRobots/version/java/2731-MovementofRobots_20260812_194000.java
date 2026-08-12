// Last updated: 12/08/2026, 19:40:00
1class Solution {
2    public String convert(String s, int r) {
3
4       if(r==1 || s.length()<r)
5       return s;
6    
7    StringBuilder[] arr = new StringBuilder[r];
8        for (int i = 0; i < r; i++) {
9        arr[i] = new StringBuilder(); 
10         }
11
12    
13    int ind=0;
14    int st=1;
15    for(char ch:s.toCharArray()){
16        arr[ind].append(ch);
17        if(ind==0)
18        st=1;
19        else if(ind == r-1)
20        st=-1;
21
22        ind+=st;
23    }
24     StringBuilder sb=new StringBuilder();
25    for(int i=0;i<r;i++){
26            sb.append(arr[i]);
27    }
28
29    return sb.toString();
30
31    }
32}