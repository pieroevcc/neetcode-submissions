class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int rob1 = 0;
        int rob2 = 0;
        int rob3 = 0;
        int rob4 = 0;
        for (int i = nums.length-1; i >= 1; i--){
            int temp = Math.max(nums[i] + rob2, rob1);
            rob2 = rob1;
            rob1 = temp;
            int temp1 = Math.max(nums[i-1] + rob4, rob3);
            rob4 = rob3;
            rob3 = temp1;
        }
        return Math.max(rob1, rob3);
    }
}
