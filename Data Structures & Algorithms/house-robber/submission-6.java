class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int robNextPlusOne = 0;
        int robNext = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int current = Math.max(nums[i] + robNextPlusOne, robNext);
            robNextPlusOne = robNext;
            robNext = current;
        }  
        return robNext;
    }
}
