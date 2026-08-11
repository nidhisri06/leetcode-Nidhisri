// Last updated: 11/08/2026, 14:13:57
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length, ans=0;
        long[] pre = new long[n+1];
        for(int i=0;i<n;i++) pre[i+1]=pre[i]+nums[i];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long sum=pre[j+1]-pre[i];
                if(sum%10==x && first(sum)==x) ans++;
            }
        }
        return ans;
    }
    int first(long n){
        while(n>=10) n/=10;
        return (int)n;
    }
}