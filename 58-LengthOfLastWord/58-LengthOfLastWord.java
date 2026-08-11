// Last updated: 11/08/2026, 14:17:52
class Solution {
    public int lengthOfLastWord(String s) {
        int length =0 ;
        int i=s.length ()-1;
        while(i>=0&&s.charAt(i)==' ') 
            i--;
        while(i>=0 &&s.charAt(i)!=' ') {
            length++;
            i--;
        }
        return length;
    }
}