// Last updated: 11/08/2026, 19:43:04
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==2*arr[j]&&i!=j)
                {
                    return true;
                }
            }
        }
        return false;
    }
}