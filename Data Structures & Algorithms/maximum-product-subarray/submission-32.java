class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = nums[0];
        int dp = 0, dp2 = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            dp = nums[i] * (dp == 0 ? 1 : dp);
            dp2 = nums[n - 1 -i] * (dp2 == 0 ? 1 : dp2);
            res = Math.max(res, Math.max(dp, dp2));
        }
        return res;
    }
}
