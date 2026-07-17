class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();
        bool row = false;
        for (int i = 0; i < cols; i++){
            if (matrix[0][i] == 0){
                row = true;
                break;
            }
        }
        bool col = false;
        for (int i = 0; i < rows; i++){
            if (matrix[i][0] == 0){
                col = true;
                break;
            }
        }
        for (int i = 1; i < rows; i++){
            for (int j = 1; j < cols; j++){     
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0; //leftmost
                    matrix[0][j] = 0; //topmost
                }
            }
        }
        

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (col) {
            for(int j = 0; j < rows; j++){
                    matrix[j][0] = 0;
            }
        }
        if (row){
            std::fill(matrix[0].begin(), matrix[0].end(), 0);
        }

        return;
    }
};
