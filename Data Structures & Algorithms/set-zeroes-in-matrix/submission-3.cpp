class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        bool both = false;
        bool col = false;
        if (matrix[0][0] == 0) {
            both = true;
        }
        bool row = false;
        for (int i = 1; i < matrix[0].size(); i++){
            if (matrix[0][i] == 0){
                row = true;
            }
        }

        for (int i = 1; i < matrix.size(); i++){
            if (matrix[i][0] == 0){
                col = true;
            }
        }
        for (int i = 0; i < matrix.size(); i++){
            for (int j = 0; j < matrix[0].size(); j++){     
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0; //leftmost
                    matrix[0][j] = 0; //topmost
                }
            }
        }
        

        //set column to 0
        for (int i = 1; i < matrix[0].size(); i++){
            if (matrix[0][i] == 0){
                for(int j = 0; j < matrix.size(); j++){
                    matrix[j][i] = 0;
                }
            }
        }

        //set row to 0
        for (int i = 1; i < matrix.size(); i++){
            if (matrix[i][0] == 0){
                std::fill(matrix[i].begin(), matrix[i].end(), 0);
            }
        }

        if (both){
            std::fill(matrix[0].begin(), matrix[0].end(), 0);
            for(int j = 1; j < matrix.size(); j++){
                    matrix[j][0] = 0;
            }
            return;
        }
        if (col){
            for(int j = 1; j < matrix.size(); j++){
                    matrix[j][0] = 0;
            }
            return;
        }
        if (row){
            std::fill(matrix[0].begin(), matrix[0].end(), 0);
            return;
        }

        return;
    }
};
