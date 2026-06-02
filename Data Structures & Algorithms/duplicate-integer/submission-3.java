class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if(res.contains(nums[i])){
                return true;
            }
            res.add(nums[i]);
        }
        return false;
    }
}