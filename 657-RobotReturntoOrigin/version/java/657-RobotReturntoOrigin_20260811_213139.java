// Last updated: 11/08/2026, 21:31:39
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] arr = s.toCharArray();
4        int start = 0, end = arr.length - 1;
5        while (start < end) {
6            if (Character.isLetter(arr[start]) && Character.isLetter(arr[end])) {
7                char temp = arr[start];
8                arr[start] = arr[end];
9                arr[end] = temp;
10                start++;
11                end--;
12            } else if (!Character.isLetter(arr[start])) {
13                start++;
14            } else {
15                end--;
16            }
17        }
18        return new String(arr);
19    }
20}