// Last updated: 11/08/2026, 14:13:58
class Solution {
    public int shortestPath(int n, int[][] edges, String s, int k) {
        List<int[]>[] g= new ArrayList[n];
        for(int i=0;i<n;i++) g[i]= new ArrayList<>();
        for(int[] e: edges) g[e[0]].add(new int[] {e[1], e[2]});
        long[][] d = new long[n][k+1];
        for(long[] r:d) Arrays.fill(r,Long.MAX_VALUE);
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b) ->        Long.compare(a[0],b[0]));   
        d[0][1]=0;
        pq.offer(new long[]{0,0,1});
        while(!pq.isEmpty()){
            long[] cur=pq.poll();
            long w= cur[0];
            int u=(int) cur[1],c=(int) cur[2];
            if(u==n-1) return (int) w;
            if(w !=d[u][c]) continue;
            for(int[] e : g[u]) {
                int v=e[0],nc=s.charAt(v)==s.charAt(u) ? c+1:1;
                if(nc>k) continue;
                long nw = w+ e[1];
                if(nw<d[v][nc]){
                    d[v][nc]=nw;
                    pq.offer(new long[] {nw,v,nc});
                }
            }
        }
        return -1;
    }
}