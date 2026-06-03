class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            nums[Math.abs(nums[i]) - 1] *= -1;
            if (nums[Math.abs(nums[i]) - 1] > 0){
                return nums[Math.abs(nums[i]) - 1];
            }
        }
        return -1;
    }
}
