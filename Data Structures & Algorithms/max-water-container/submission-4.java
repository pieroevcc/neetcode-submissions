class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max = 0;
        while (i < j){
            int curr = Math.min(heights[i], heights[j]) * (j - i);
            if(heights[i] < heights[j]){
                i++;
                if (curr > max) max = curr;
            }
            else if(heights[i] > heights[j]){
                j--;
                if (curr > max) max = curr;
            }
            else{

                if (curr > max) max = curr;
                i++;
                j--;
            }
        }
        return max;
    }
}
