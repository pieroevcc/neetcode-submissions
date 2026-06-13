class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, new ArrayList<>(), candidates, 0, target, 0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> curr, int[] nums,  int sum, int target, int start){
        if (sum == target) res.add(new ArrayList<>(curr));
        else if (sum < target){ 
            for (int i = start; i < nums.length; i++){
                if (i > start && nums[i] == nums[i-1]) continue;
                curr.add(nums[i]);
                sum += nums[i];
                backtrack(res, curr, nums, sum , target, i+1);
                sum -= curr.remove(curr.size()-1);
            }
        }
        else{
            return;
        }
    }
}
