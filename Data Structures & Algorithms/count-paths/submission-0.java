class Solution {
    //corners are only used once
    //edges are only used m or n times
    public int uniquePaths(int m, int n) {
        int[][] cache = new int[m][n];
        return rec(0, 0, cache);
    }

    public int rec(int i, int j, int[][]cache){
        if (i == cache.length-1 && j == cache[0].length-1) return 1;
        if (i < 0 || i > cache.length-1 || j < 0 || j > cache[0].length-1) return 0;
        if (cache[i][j] > 0) return cache[i][j];
        cache[i][j] = rec(i+1, j, cache) + rec(i, j+1, cache);
        return cache[i][j];
    }
}
