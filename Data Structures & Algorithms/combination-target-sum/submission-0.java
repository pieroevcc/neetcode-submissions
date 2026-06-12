class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums ,0, target, 0);
        return list;
        
    }

    public void backtrack(List<List<Integer>> list , List<Integer> curr, int[] nums, int sum, int target, int start){
        if (sum == target) list.add(new ArrayList<>(curr));
        else if (sum <= target){
            for (int i = start; i < nums.length; i++){
                curr.add(nums[i]);
                sum += nums[i];
                backtrack(list, curr, nums, sum, target, i);
                sum -= curr.getLast();
                curr.remove(curr.size()-1);
            }
        }
        else{
            return;
        }
    }
}
