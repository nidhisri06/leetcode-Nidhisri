// Last updated: 11/08/2026, 19:38:39
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        for(int i=0;i<arr.length;i++)
4        {
5            for(int j=0;j<arr.length;j++)
6            {
7                if(arr[i]==2*arr[j]&&i!=j)
8                {
9                    return true;
10                }
11            }
12        }
13        return false;
14    }
15}