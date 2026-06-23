class Solution {
    public int rob(int[] nums) {
        int[] cache = new int[nums.length];
        return Math.max(rec(nums, 0, cache), rec(nums,1, cache));
    }

    public int rec (int[] nums, int i, int[] cache){
        if (i >= nums.length) return 0;
        if (cache[i] > 0) return cache[i];
        cache[i] = nums[i] + Math.max(rec(nums, i + 2, cache), rec(nums, i+3, cache));
        return cache[i];
    }
}
