class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    int curr = find(grid, i, j);
                    max = Math.max(max, curr);
                }
            }
        }
        return max;
    }
    public int find(int[][] grid, int i, int j){
        if (i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length-1 || grid[i][j] == 0) return 0;
        int curr = 1;
        grid[i][j] = 0;
        curr += find(grid, i+1, j) + find(grid, i, j+1) + find(grid, i-1, j) + find(grid, i, j-1);
        return curr;
    }
}
