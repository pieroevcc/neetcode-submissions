class Solution {
public:
    void solve(vector<vector<char>>& board) {
        if (board.size() <= 2 || board[0].size() <= 2) return;

        for (int i = 0; i < board[0].size(); i++){
            if (board[0][i] == 'O') dfs(board, 0, i);
            if (board[board.size()-1][i] == 'O' ) dfs(board, board.size()-1, i); 
        }

        for (int i = 0; i < board.size(); i++){
            if (board[i][0] == 'O') dfs(board, i, 0); 
            if (board[i][board[0].size()-1] == 'O') dfs(board, i, board[0].size()-1);
        }

        for (int i = 0; i < board.size(); i++){
            for (int j = 0; j < board[0].size(); j++){
                if (board[i][j] == '#'){
                    board[i][j] = 'O';
                }
                else if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
        return;
    }

    void dfs(vector<vector<char>>&board, int i, int j){
        if (i > board.size()-1 || j > board[0].size()-1 || i < 0 || j < 0) return;
        if (board[i][j] != 'O') return;
        if(board[i][j] == 'O') board[i][j] = '#';
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
        return;
    }
};
