class Solution {
    //check the min of the next cost 
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(rec(0, cost, new int[cost.length]), rec(1, cost, new int[cost.length]));
    }

    public int rec(int i, int[] cost, int[] cache){
        if (i >= cost.length) return 0;
        if(cache[i] > 0) return cache[i];
        cache[i] += Math.min(rec(i+1, cost, cache), rec(i+2, cost, cache));
        cache[i] += cost[i];
        return cache[i];
    }
}
