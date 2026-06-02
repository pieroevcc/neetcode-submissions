class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (matrix[mid][0] <= target && target <= matrix[mid][matrix[mid].length - 1]) {
                int low2 = 0;
                int high2 = matrix[mid].length - 1;
                while(low2 <= high2){
                    int mid2 = low2 + (high2-low2)/2;
                    if(matrix[mid][mid2] == target) return true;
                    else if (matrix[mid][mid2] > target){
                        high2 = mid2-1;
                    }
                    else{
                        low2 = mid2+1;
                    }
                }
                return false;
            }
            else if (matrix[mid][0] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}
