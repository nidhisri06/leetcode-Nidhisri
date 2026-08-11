// Last updated: 11/08/2026, 19:36:49
1class Solution {
2    public int removeDuplicates(int[] arr) {
3        int i=0;
4        for(int j=1;j<arr.length;j++){
5            if(arr[i]!=arr[j]){
6                i++;
7                arr[i]=arr[j];
8            }
9        }
10        return i+1;
11        
12    }
13}