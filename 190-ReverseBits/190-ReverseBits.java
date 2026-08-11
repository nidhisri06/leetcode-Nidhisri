// Last updated: 11/08/2026, 14:17:13
class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result = result << 1;      // make space for next bit
            result = result | (n & 1); // copy last bit of n into result
            n = n >>> 1;               // shift n to check next bit
        }

        return result;
    }
}