// Last updated: 11/08/2026, 19:24:36
1class Solution {
2    private int n, m;
3
4    private void dfs(int i, int j, char[][] board)
5    {
6        if(i<0 || j<0 || i>=n || j>=m || board[i][j]!='O')
7        {
8            return;
9        }
10
11        board[i][j]='B';
12
13        dfs(i+1, j, board);
14        dfs(i-1, j, board);
15        dfs(i, j+1, board);
16        dfs(i, j-1, board);
17    }
18    public void solve(char[][] board) {
19
20       n=board.length;
21       m=board[0].length;
22
23       for(int i=0; i<m; i++)
24       {
25        if(board[0][i]=='O')
26        {
27            dfs(0, i, board);
28        }
29
30        if(board[n-1][i]=='O')
31        {
32            dfs(n-1, i, board);
33        }
34       }
35
36       for(int i=0; i<n; i++)
37       {
38        if(board[i][0]=='O')
39        {
40            dfs(i, 0, board);
41        }
42
43        if(board[i][m-1]=='O')
44        {
45            dfs(i, m-1, board);
46        }
47       }
48
49       for(int i=0; i<n; i++)
50       {
51        for(int j=0; j<m; j++)
52        {
53            if(board[i][j]=='B')
54            {
55                board[i][j]='O';
56            }
57            else if(board[i][j]=='O')
58            {
59                board[i][j]='X';
60            }
61        }
62       }
63
64    }
65}