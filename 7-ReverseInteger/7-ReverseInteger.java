// Last updated: 11/08/2026, 14:18:14
class Solution {
    public int reverse(int x) {
        long ans = 0;
        int r = 0;
        while (x != 0) {
            r = x % 10;
            ans = ans * 10 + r;
            x /= 10;
        }
        return (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) ? 0 : (int) ans;
    }
}