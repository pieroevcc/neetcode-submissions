class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int dp[] = new int[nums.length];
        int dp2[] = new int[nums.length];
        int res = nums[0];
        dp[0] = nums[0];
        dp2[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(Math.max(nums[i], dp[i-1] * nums[i]), dp2[i-1] * nums[i]);
            dp2[i] = Math.min(Math.min(nums[i], dp2[i-1] * nums[i]), dp[i-1] * nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
