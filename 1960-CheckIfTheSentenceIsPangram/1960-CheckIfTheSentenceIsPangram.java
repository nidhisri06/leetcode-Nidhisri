// Last updated: 12/08/2026, 18:26:12
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
        for(int ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)<0)
            {
                return false;
            }
        }
        return true;
    }
}