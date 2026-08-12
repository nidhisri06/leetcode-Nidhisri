// Last updated: 12/08/2026, 17:43:53
1/*
2TC: O(V+E)
3SC: O(V+E)
4*/
5class Solution {
6    boolean found = false;
7    public boolean validPath(int n, int[][] edges, int start, int end) {
8        if(start == end) return  true;
9        
10        Map<Integer,List<Integer>> graph = new HashMap();
11        boolean[] visited = new boolean[n];
12        
13        for(int i = 0 ; i < n ; i++) graph.put(i, new ArrayList());
14         //construct graph, add bidirectional vertex
15        for(int[] edge : edges){
16           graph.get(edge[0]).add(edge[1]);
17           graph.get(edge[1]).add(edge[0]);
18        }
19		//start dfs from start point
20        dfs(graph,visited,start,end);
21        return found;
22    }
23    
24    private void dfs(Map<Integer,List<Integer>> graph,boolean[] visited, int start, int end){
25        if(visited[start] || found) return;
26        visited[start] = true;
27        //when we found and neighbour which is equal to end point inside the recursion, voooleeey! break and return the true
28        for(int nei : graph.get(start)){
29            if(nei == end){
30                found = true;
31                break;
32            }
33            if(!visited[nei])
34                dfs(graph, visited, nei, end); //otherwise deep dig again!
35        }
36    }
37}