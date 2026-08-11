// Last updated: 11/08/2026, 21:38:13
1class Solution {
2    public String sortSentence(String s) {
3        String[] arr = s.split(" ");
4        int i=0;
5        while(i<arr.length){    // Cycle sort
6            int x = arr[i].charAt(arr[i].length()-1) - '0';
7            int correct = x-1;
8            if(i != correct){ // swap
9                String temp = arr[i];
10                arr[i] = arr[correct];
11                arr[correct] = temp;
12            }
13            else
14                i++;
15        }
16        StringBuilder sb = new StringBuilder();
17        for(int j=0;j<arr.length;j++){
18            sb.append(arr[j].substring(0,arr[j].length()-1));
19            if(j!=arr.length-1)
20                sb.append(" ");
21        }
22        return sb.toString();
23    }
24} 