// Last updated: 11/08/2026, 14:17:50
class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];
        return dp(0,n);
    }
    public int dp(int current,int n){
        if(current == n) return 1;
        if(current > n) return 0;

        if(memo[current]!=0) return memo[current];

        int ways = 0;

        for(int i=1;i<=2;i++){
            ways += dp(current+i,n);
        }

        memo[current] = ways;
        return ways;
    }
}