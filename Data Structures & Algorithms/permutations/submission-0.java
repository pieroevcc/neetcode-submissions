class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(res, new ArrayList<>(), nums, visited);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> curr, int[] nums, boolean[] visited){
        if (curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if (visited[i] == false){
                curr.add(nums[i]);
                visited[i] = true;
                backtrack(res, curr, nums, visited);
                visited[i] = false;
                curr.remove(curr.size()-1);
            }
        }
        return;
    }
}