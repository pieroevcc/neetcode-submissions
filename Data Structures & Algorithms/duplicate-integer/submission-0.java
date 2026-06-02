class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if(res.contains(nums[i])){
                return true;
            }
            else{
                res.add(nums[i]);
            }
        }
        return false;
    }
}