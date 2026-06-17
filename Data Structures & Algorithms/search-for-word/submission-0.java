class Solution {
    public boolean exist(char[][] board, String word) {
        char[] letters = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(letters[0] == board[i][j]){
                    boolean s = find(board, letters, i, j, 0);
                    if (s) return true;
                }
            }
        }
        return false;
    }

    public boolean find(char[][] board, char[] word, int i, int j, int start){
        if (j > board[0].length-1 || j < 0 || i < 0 || i > board.length-1 ) return false;
        if (word[start] == board[i][j]){
            if (start == word.length - 1) return true;
            char temp = board[i][j];
            board[i][j] = '#';
            boolean found = find(board, word, i, j+1, start+1) ||
            find(board, word, i, j-1, start+1) ||
            find(board, word, i+1, j, start+1) ||
            find(board, word, i-1, j, start+1);
            board[i][j] = temp;
            return found;
        }
        else{
            return false;
        }
        
    }
}
