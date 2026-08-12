// Last updated: 12/08/2026, 11:10:18
1class Solution {
2    public String[] splitMessage(String message, int limit) {
3        
4        int low = 1, high = message.length();
5        int result = Integer.MAX_VALUE;
6
7        while( low<=high ) {
8            int mid = low + (high-low)/2;
9
10            int value = checkValidity(message, limit, mid); 
11            // System.out.println(mid+" "+value);
12            if(value == 0) {
13                result = Math.min(result, mid);
14                high = mid - 1;
15                low = 1;
16            }
17            else if( value == -1 ) high = mid - 1;
18            else low = mid + 1;
19        }
20        // System.out.println(result);
21
22        if( result == Integer.MAX_VALUE) return new String[0];
23        else return getFormattedStrings(message, limit, result);
24    }
25
26    private int checkValidity(String message, int limit, int k) {
27
28        int idx = 0;
29        for(int i=1; i<=k; i++) {
30
31            if( idx >= message.length() ) return -1;
32            String format = "<"+i+"/"+k+">";
33            int left = limit - format.length();
34
35            if( left <= 0 ) return -1;
36
37            idx += left;
38
39
40        }
41
42        if( idx < message.length()) return 1;
43
44        return 0;
45    }
46
47    private String[] getFormattedStrings(String message, int limit, int k) {
48        String [] result = new String[k];
49
50        int idx = 0;
51        for(int i=1; i<=k; i++) {
52            String format = "<"+i+"/"+k+">";
53            int diff = limit-format.length();
54            
55            if( idx+diff > message.length() ) result[i-1] = message.substring(idx)+format;
56            else result[i-1] = message.substring(idx, idx+diff)+format;
57
58            idx += diff;
59        }
60        return result;   
61    }
62}