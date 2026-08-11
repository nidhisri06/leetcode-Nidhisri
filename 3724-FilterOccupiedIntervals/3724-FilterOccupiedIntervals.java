// Last updated: 11/08/2026, 14:13:59
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) { 
        Arrays.sort(occupiedIntervals,(a,b)->a[0]-b[0]);
        List<int[]> m = new ArrayList<>();
        for(int[] x:occupiedIntervals){
            if(m.isEmpty()||x[0]>m.get(m.size()-1)[1]+1)
                m.add(new int[] {x[0],x[1]});
            else
                m.get(m.size()-1)[1]=Math.max(m.get(m.size()-1)[1],x[1]); 
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int[] x:m){
            if(x[1]<freeStart||x[0]>freeEnd) ans.add(Arrays.asList(x[0],x[1]));
            else{
                if(x[0]<freeStart) ans.add(Arrays.asList(x[0],freeStart-1));
                if(x[1]>freeEnd) ans.add(Arrays.asList(freeEnd+1,x[1]));
            }
        }
        return ans; 
    }
}