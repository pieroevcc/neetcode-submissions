class Solution {
    int count = 0;
    char[][] marked;
    public int numIslands(char[][] grid) {
        marked = new char[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1' && marked[i][j] != '#'){
                    find(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void find(char[][] grid,  int i, int j){
        if (i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length-1 || marked[i][j] == '#' || grid[i][j] == '0') return;
        marked[i][j] = '#';
        find(grid, i+1, j);
        find(grid, i, j+1);
        find(grid, i-1, j);
        find(grid, i, j-1);
        return;
    }
}
