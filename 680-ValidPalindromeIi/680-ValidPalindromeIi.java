// Last updated: 11/08/2026, 14:15:38
class Solution {
    public boolean validPalindrome(String s) {
    int left=0;
    int right=s.length()-1;
    while(left<right){
        int ch=s.charAt(left);
        int ch1=s.charAt(right);
        if(ch==ch1){
            left++;
            right--;
        }
        else{
            return palindrome(s,left+1,right)||palindrome(s,left,right-1);
        }
    }
    return true;
    }
    public static boolean palindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }