class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        std::vector<int> arr;
        int top = 0;
        int right = matrix[0].size();
        int left = 0;
        int bottom = matrix.size();

        while (left < right && top < bottom){
            for (int i = left; i < right; i++){
                arr.emplace_back(matrix[top][i]);
            }
            top++;
            for (int i = top; i < bottom; i++){
                arr.emplace_back(matrix[i][right-1]);
            }
            right--;
            if (!(left < right && top < bottom)) break;
            for (int i = right-1; i >= left; i--){
                arr.emplace_back(matrix[bottom-1][i]);
            }
            bottom--;
            for (int i = bottom-1; i >= top; i--){
                arr.emplace_back(matrix[i][left]);
            }
            left++;
        }
        return arr;
    }
};
