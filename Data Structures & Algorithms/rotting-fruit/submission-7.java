class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                if (grid[i][j] == 1) fresh++;
            }
        }
        int count = 0;
        int[][] dirs = {{0,-1}, {-1, 0}, {1, 0}, {0, 1}};
        while(!q.isEmpty()){
            int size = q.size();
            boolean t= false;
            for (int k = 0; k < size; k++){
                int[] curr = q.poll();
                int i = curr[0];
                int j = curr[1];
                for(int[] dir : dirs){
                    int nextI = i + dir[0];
                    int nextJ = j + dir[1];
                    if (nextI >= 0 && nextI < grid.length && nextJ >= 0 && nextJ < grid[0].length && grid[nextI][nextJ] == 1){
                        q.add(new int[]{nextI, nextJ});
                        grid[nextI][nextJ] = 2;
                        fresh--;
                        t = true;
                    }
                }
            }
            if (t) count++;
        }
        if (fresh != 0) return -1;
        return count;
    }
}
