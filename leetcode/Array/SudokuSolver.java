class Solution {
    public void solveSudoku(char[][] board) {
        putValueInSudoko(board);
    }
    public static boolean putValueInSudoko(char x[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (x[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (check(x, i, j, k)) {
                            x[i][j] = k;
                            if (putValueInSudoko(x)) return true;
                        }
                        x[i][j] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean check(char x[][], int r, int c, char val) {
        for (int i = 0; i < 9; i++) {
            if (x[r][i] == val) return false;
            if (x[i][c] == val) return false;
        }
        r = (r / 3) == 0 ? 0 : (r / 3) == 1 ? 3 : 6;
        c = (c / 3) == 0 ? 0 : (c / 3) == 1 ? 3 : 6;
        for (int i = r; i < r + 3; i++)
        for (int j = c; j < c + 3; j++)
        if (x[i][j] == val) return false;
        return true;
    }
}
