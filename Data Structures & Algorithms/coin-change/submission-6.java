class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (coins.length==1 && amount%coins[0] != 0) return -1;
        Arrays.sort(coins);
        return rec(coins, amount, coins.length-1);
        
    }

    public int rec(int[] coins, int amount, int i){
        if (amount == 0) return 0;
        if (i < 0 || amount < 0) return Integer.MAX_VALUE;
        int g = rec(coins, amount, i - 1);
        int take = rec(coins, amount - coins[i], i);
        int k = (take == Integer.MAX_VALUE) ? Integer.MAX_VALUE : 1 + take;
        return Math.min(g, k);
    }
}
