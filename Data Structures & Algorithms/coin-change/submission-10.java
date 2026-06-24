class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] cache = new int[amount+1];
        Arrays.fill(cache , max);

        cache[0] = 0;
        for (int i = 1; i <= amount; i++){
            for(int coin : coins){
                if (i - coin >= 0){
                    cache[i] = Math.min(cache[i], cache[i - coin] + 1);
                }
            }
        }
        return cache[amount] > amount ? -1 : cache[amount];
    }
}
