class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        return rec(0, n , new int[n]);
    }

    public int rec(int i, int n, int[] cache){
        if(i > n) return 0;
        if(i == n) return 1;
        if(cache[i] > 0) return cache[i];
        cache[i] = rec(i+1, n , cache) + rec(i+2, n ,cache);
        return cache[i];
    }
}
