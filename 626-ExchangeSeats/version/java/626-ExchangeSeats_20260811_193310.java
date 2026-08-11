// Last updated: 11/08/2026, 19:33:10
1class Solution {
2    public int dayOfYear(String date) {
3        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
4        
5        int year = Integer.parseInt(date.substring(0, 4));
6        int month = Integer.parseInt(date.substring(5, 7));
7        int day = Integer.parseInt(date.substring(8, 10));
8
9        if (isLeapYear(year)) {
10            days[1] = 29;
11        }
12
13        int totalDays = 0;
14        for(int i = 0; i < month - 1; i++){
15            totalDays += days[i];
16        }
17        totalDays += day;
18
19        return totalDays;
20    }
21
22    boolean isLeapYear(int year){
23        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
24    }
25}