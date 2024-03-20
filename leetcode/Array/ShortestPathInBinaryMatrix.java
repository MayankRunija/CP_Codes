class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0) return -1;
        int m = grid.length, n = grid[0].length;
        if (grid[0][0] == 0 && m == 1 && n == 1) return 1;
        boolean[][] vis = new boolean[m][n];
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0, 0, 1});
        vis[0][0] = true;

        while (!q.isEmpty()) {
            int[] coor = q.poll();

            for (int i = 0; i < 8; i++) {
                int x = coor[0] + dx[i], y = coor[1] + dy[i], steps = coor[2];
                if (Math.min(x, y) < 0 || x >= m || y >= n || vis[x][y] || grid[x][y] == 1) continue;
                if (x == m - 1 && y == n - 1) return steps + 1;
                q.add(new int[] {x, y, steps + 1});
                vis[x][y] = true;
            }
        }

        return -1;
    }
}
