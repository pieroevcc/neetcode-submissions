class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < edges.length+1; i++){
            list.add(new ArrayList<>());
        }
        Set<Integer> visit = new HashSet<>();
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            visit.clear();
            if (dfs(u, v, list ,visit)){
                return new int[]{u,v};
            }
            list.get(u).add(v);
            list.get(v).add(u);
            
        }
        return new int[2];
    }


    public boolean dfs(int u, int v, List<List<Integer>> list, Set<Integer> visit){
        if (u == v) return true;
        visit.add(u);
        for(int i = 0; i < list.get(u).size(); i++){
            int curr = list.get(u).get(i);
            boolean t = false;
            if(!visit.contains(curr)){
                t = dfs(curr, v, list, visit);
                if (t) return t;
            }
        }
        return false;
    }
}
