class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<List<Integer>> q = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 0){
                    q.offer(Arrays.asList(i,j));
                    visited[i][j] = true;
                }
                if(grid[i][j] == -1) visited[i][j] = true;
            }
        }
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!q.isEmpty()){
            List<Integer> curr = q.poll();
            int i = curr.get(0);
            int j = curr.get(1);
            for(int[] dir : dirs){
                int nextI = i + dir[0];
                int nextJ = j + dir[1];
                if(nextI >= 0 && nextI < grid.length && nextJ >= 0 && nextJ < grid[0].length && !visited[nextI][nextJ]){
                    grid[nextI][nextJ] = grid[i][j] + 1;
                    q.add(Arrays.asList(nextI, nextJ));
                    visited[nextI][nextJ] = true;
                }
            }
 
        }
        return;
    }
}
