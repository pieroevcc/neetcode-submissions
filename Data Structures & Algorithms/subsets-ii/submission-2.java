class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(new ArrayList<>(), nums, 0);
        return res;
    }

    public void backtrack(List<Integer> curr, int[] nums, int start){
        if (!res.contains(curr)){
            res.add(new ArrayList<>(curr));
        } 
        for(int i = start; i < nums.length; i++){
            curr.add(nums[i]);
            backtrack(curr, nums, i+1);
            curr.remove(curr.size() -1);
        }
    }
}
