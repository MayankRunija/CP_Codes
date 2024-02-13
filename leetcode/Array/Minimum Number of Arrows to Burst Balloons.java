class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(value -> ((int[])value)[0]).thenComparingInt(value -> ((int[])value)[1]));
        int count = 1, nextIdx = 0;
        while(nextIdx < points.length) {
            int[] p = points[nextIdx];
            boolean idxChanged = false;
            for (int j = nextIdx + 1; j < points.length; j++) {
                int[] temp = points[j];
                if (temp[1] < p[1]) p[1] = temp[1];
                if (p[1] < temp[0]) {
                    idxChanged = true;
                    nextIdx = j;
                    count++;
                    break;
                }
            }
            if (!idxChanged) nextIdx++;
        }
        return count;
    }
}
