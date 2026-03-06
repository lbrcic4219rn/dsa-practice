package problems.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            Set<Integer> row = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.' && !row.add(board[i][j] - '0')) {
                    return false;
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            Set<Integer> column = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.' && !column.add(board[j][i] - '0')) {
                    return false;
                }
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                Set<Integer> box = new HashSet<>();
                for(int ii = 3 * i; ii < 3 * i + 3; ii++) {
                    for(int jj = 3 * j; jj < 3 * j + 3; jj++) {
                        if(board[ii][jj] != '.' && !box.add(board[ii][jj] - '0')) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
