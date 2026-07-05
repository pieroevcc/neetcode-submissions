class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int i = 0;
        int count = 0;
        int far = 0;
        while (far < nums.length-1){
            int max = 0;
            for(int x = i; x <= far; x++){
                max = Math.max(max, x + nums[x]);            
            }
            i = far +1;
            far = max;
            count++;
        }
        return count;
    }
}
