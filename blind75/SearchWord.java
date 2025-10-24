package blind75;

import java.util.HashMap;
import java.util.Map;

public class SearchWord {

    private static boolean findWord(int i, int j, String word, int idx, char[][] board) {
        if (idx == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '$') {
            return false;
        }

        if (board[i][j] != word.charAt(idx)) {
            return false;
        }

        // agar mil gya
        char temp = board[i][j];
        board[i][j] = '$';

        if (findWord(i + 1, j, word, idx + 1, board)) {// go downward
            return true;
        }

        if (findWord(i - 1, j, word, idx + 1, board))// go upward
        {
            return true;
        }
        if (findWord(i, j + 1, word, idx + 1, board))// go right
        {
            return true;
        }

        if (findWord(i, j - 1, word, idx + 1, board))// go left
        {
            return true;
        }
        board[i][j] = temp;

        return false;
    }

    public static boolean exist(char[][] board, String word) {
        boolean ans = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == word.charAt(0) && findWord(i, j, word, 0, board)) {
                    return true;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        char board[][] = {
                { 'A', 'B', 'C', 'D' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        System.out.println(exist(board, null));
    }
}
