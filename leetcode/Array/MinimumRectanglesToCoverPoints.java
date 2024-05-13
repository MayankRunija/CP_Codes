class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int numRectangles = 0;
        int n = points.length;
        int i = 0;

        while (i < n) {
            int startX = points[i][0];
            int endX = startX + w;

            int j = i;
            while (j < n && points[j][0] <= endX) {
                j++;
            }

            numRectangles++;

            i = j;
        }

        return numRectangles;
    }
}
