// Last updated: 02/09/2026, 10:15:43
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double total=0;
        while(i>=0 && j>=0){
            total+=(double) prices[i] * (100-discounts[j]) / 100;
            i--;
            j--;
        }
        while(i>=0){
            total+=prices[i];
            i--;
        }
        return total;
        
    }
}