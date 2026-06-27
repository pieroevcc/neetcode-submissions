class Solution {
    List<List<Integer>> list;
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n-1) return false;
        list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visit = new HashSet<>();
        q.offer(0);
        visit.add(0);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int neighbor: list.get(curr)){
                if(!visit.contains(neighbor)){
                    visit.add(neighbor);
                    q.offer(neighbor);
                }
            }
        }

        if (visit.size() == n){
            return true;
        }
        return false;


    }
}
