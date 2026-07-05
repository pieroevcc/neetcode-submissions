class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int i = 0;
        int count = 0;
        while (i < nums.length-1){
            int max = i + nums[i];
            if (max >= nums.length-1) return count +1;
            int nextIndex = i + nums[i];
            for(int x = i+1; x <= i + nums[i] && x < nums.length; x++){
                if (x + nums[x] > max){
                    max = x + nums[x];
                    nextIndex = x;
                }
            }
            i = nextIndex;
            count++;
        }
        return count;
    }
}
