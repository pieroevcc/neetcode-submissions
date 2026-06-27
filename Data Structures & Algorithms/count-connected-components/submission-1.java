class Solution {
    List<List<Integer>> list;
    public int countComponents(int n, int[][] edges) {
        list = new ArrayList<>();
        for(int i = 0; i < n; i++) list.add(new ArrayList<>());
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            if (!set.contains(i)){
                count++;
                q.add(i);
                while(!q.isEmpty()){
                    int curr = q.poll();
                    for(int neighbor : list.get(curr)){
                        if (!set.contains(neighbor)){
                            q.offer(neighbor);
                            set.add(neighbor);
                        }
                    }
                }
            }
        }
        return count;
    }
}
