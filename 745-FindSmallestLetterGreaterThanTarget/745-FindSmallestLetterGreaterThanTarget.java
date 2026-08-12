// Last updated: 12/08/2026, 18:28:47
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char c=letters[0];
        int tar=target-'a';
        for(int i=0;i<letters.length;i++){
            int t=(int)letters[i]-'a';
            if(t>tar) {
                c= letters[i];
                break;
            }
        }
        return c;
    }
}