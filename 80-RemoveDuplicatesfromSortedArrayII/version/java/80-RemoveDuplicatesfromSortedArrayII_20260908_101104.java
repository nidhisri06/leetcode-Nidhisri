// Last updated: 08/09/2026, 10:11:04
1public class Solution {
2    public int totalFruit(int[] fruits) {
3        int n = fruits.length;
4        int lastFruit = -1, secondLastFruit = -1;
5        int lastCount = 0, currMax = 0, max = 0;
6
7        for (int i = 0; i < n; i++) {
8            int fruit = fruits[i];
9
10            if (fruit == lastFruit || fruit == secondLastFruit) {
11                currMax++;
12            } else {
13                currMax = lastCount + 1;
14            }
15
16            if (fruit == lastFruit) {
17                lastCount++;
18            } else {
19                lastCount = 1;
20                secondLastFruit = lastFruit;
21                lastFruit = fruit;
22            }
23
24            max = Math.max(max, currMax);
25        }
26
27        return max;
28    }
29}