class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;
        int count = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]) continue;
            
            // If consecutive, increment current sequence
            if (nums[i] == nums[i-1] + 1) {
                count++;
            } else {
                // Sequence broken, update max and reset
                max = Math.max(max, count);
                count = 1;
            }

        }
        return Math.max(max, count);
    }
}
