public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] m = new boolean[9][9];
        boolean[][] m2 = new boolean[9][9];
        boolean[][] m3 = new boolean[9][9];

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    int k = i / 3 * 3 + j / 3;

                    if (m[i][num] || m2[j][num] || m3[k][num])
                        return false;

                    m[i][num] = m2[j][num] = m3[k][num] = true;
                }

        return true;
    }
}
