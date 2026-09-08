// Last updated: 08/09/2026, 10:22:40
1class Solution {
2    static int leastCol;
3    static int mostCol;
4
5    static List<List<Integer>> ans;
6    static PriorityQueue<Pair> pq;
7    
8    public List<List<Integer>> verticalTraversal(TreeNode root) {
9        ans=new ArrayList<List<Integer>>();
10
11        bfs(root);
12        int sumCol=mostCol-leastCol+1;
13
14        for(int i=0;i<sumCol;i++)
15            ans.add(new ArrayList<Integer>());
16        
17        while(!pq.isEmpty()){
18            Pair curr=pq.poll();
19            ((ArrayList<Integer>)ans.get(-leastCol+curr.col)).add(curr.node.val);
20        }
21        
22        return (List<List<Integer>> )ans;
23    }
24    public static void bfs(TreeNode root){
25        Queue<Pair> q=new LinkedList<Pair>();
26        pq =new PriorityQueue<Pair>();
27        int row=0;
28        int col=0;
29        q.add(new Pair(row,col, root));
30        leastCol=0;
31        mostCol=0;
32        row=1;
33        
34        while(!q.isEmpty()){
35            Pair curr = q.poll();
36            pq.add(curr);
37            
38            if(curr.node.left!=null){
39                q.add(new Pair(curr.row+1, curr.col-1, curr.node.left));
40                leastCol=Math.min(leastCol, curr.col-1);
41            }
42            if(curr.node.right!=null){
43                q.add(new Pair(curr.row+1, curr.col+1, curr.node.right));
44                mostCol=Math.max(mostCol, curr.col+1);
45
46            }
47        }
48    }
49    
50    static class Pair implements Comparable<Pair>{
51        int col;
52        int row;
53        TreeNode node;
54        public Pair(int r,int c, TreeNode n){
55            row=r;
56            col=c;
57            node=n;
58        }
59        public int compareTo(Pair p){
60            if(col!=p.col) return col-p.col;
61            if(row!=p.row) return row-p.row;
62            return node.val-p.node.val;
63        }
64    }
65}