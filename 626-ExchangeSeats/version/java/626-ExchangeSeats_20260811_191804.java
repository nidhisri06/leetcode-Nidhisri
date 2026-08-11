// Last updated: 11/08/2026, 19:18:04
1class Solution {
2    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
3        
4        int n = arr.length;
5        
6        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> Double.compare((double)y[0] / y[1], (double)x[0] / x[1]));
7        
8        for (int i = 0 ; i < n ; i++) {
9            for  (int j = i+1 ; j < n ; j++) {
10                maxHeap.add(new int[] {arr[i], arr[j]});
11                if (maxHeap.size() > k) maxHeap.poll();
12            }
13        }
14        
15        return maxHeap.peek();
16    }
17} 