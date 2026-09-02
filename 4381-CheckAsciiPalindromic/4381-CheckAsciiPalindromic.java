// Last updated: 02/09/2026, 10:15:41
class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();
        for(char ch:s.toCharArray()) {
            String bin = Integer.toBinaryString(ch);
            while(bin.length()  < 8){
                bin="0"+bin;
            }
            binary.append(bin);
        }int left=0;
        int right = binary.length() -1;
        while(left < right){
            if(binary.charAt(left) != binary.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}