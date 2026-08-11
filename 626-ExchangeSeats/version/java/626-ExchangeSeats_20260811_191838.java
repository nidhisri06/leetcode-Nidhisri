// Last updated: 11/08/2026, 19:18:38
1class Solution {
2    public boolean validTicTacToe(String[] board) {
3        int x = 0;
4        int y = 0;
5        for(int i=0;i<3;i++){
6            for(char j:board[i].toCharArray()){
7                if(j=='X') x++;
8                else if(j=='O') y++;
9            }
10        }
11        if(x<y) return false;
12        if(x>y+1) return false;
13        if(isGame(board,'X') && x==y) return false;
14        if(isGame(board,'O') && x>y) return false;
15        return true;
16    }
17    public boolean isGame(String[]board,char ch){
18        String str;
19        if(ch=='X') str = "XXX";
20        else str = "OOO";
21        for(int i=0;i<board.length;i++){
22            if(board[i].equals(str)) return true;
23        }
24        if(board[0].charAt(0)== ch && board[1].charAt(0)==ch && board[2].charAt(0)==ch) return true;
25        if(board[0].charAt(1)==ch && board[1].charAt(1)==ch && board[2].charAt(1)==ch) return true;
26        if(board[0].charAt(2)==ch && board[1].charAt(2)==ch && board[2].charAt(2)==ch) return true;
27        if(board[0].charAt(0)==ch && board[1].charAt(1)==ch && board[2].charAt(2)==ch) return true;
28        if(board[0].charAt(2)==ch && board[1].charAt(1)==ch && board[2].charAt(0)==ch) return true;
29        return false;
30    }
31}