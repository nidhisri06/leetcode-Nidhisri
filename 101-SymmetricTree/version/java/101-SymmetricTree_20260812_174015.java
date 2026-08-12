// Last updated: 12/08/2026, 17:40:15
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int originalColor = image[sr][sc];
4
5        // Base case: if target color is same as starting color, return directly
6        if (originalColor == color) return image;
7
8        dfs(image, sr, sc, originalColor, color);
9
10        return image;
11    }
12
13    void dfs(int[][] image, int sr, int sc, int originalColor, int givenColor) {
14        int m = image.length;
15        int n = image[0].length;
16
17        // Boundary checks and color match check
18        if (sr < 0 || sr >= m || sc < 0 || sc >= n) return;
19        if (image[sr][sc] != originalColor) return;
20
21        // Update color
22        image[sr][sc] = givenColor;
23
24        // Recurse on adjacent pixels using originalColor
25        dfs(image, sr + 1, sc, originalColor, givenColor);
26        dfs(image, sr - 1, sc, originalColor, givenColor);
27        dfs(image, sr, sc + 1, originalColor, givenColor);
28        dfs(image, sr, sc - 1, originalColor, givenColor);
29    }
30}