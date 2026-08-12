// Last updated: 12/08/2026, 14:33:58
1class RecentCounter {
2    private static final int[] records = new int[10000]; //
3    private int start;
4    private int end;
5
6    public RecentCounter() {        
7        start = 0;
8        end = 0;
9    }
10    
11    public int ping(int t) {
12        while (start < end && (t - records[start] > 3000)) { 
13            start++; // if the difference in time is greater than 3000ms, 
14            // than increase the value of start unitl it's equal or less than 3000ms.
15        }
16        records[end++] = t; // Inserting the current time at the end
17        return end - start; // Returning the answer including the element added just now.
18    }
19}