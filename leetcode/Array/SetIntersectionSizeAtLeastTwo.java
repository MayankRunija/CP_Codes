class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
         // Sort intervals based on their end points in ascending order
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            } else {
                return b[0] - a[0];
            }
        });

        int count = 0;
        int first = -1; // Initialize the first point of the intersection window
        int second = -1; // Initialize the second point of the intersection window

        for (int[] interval : intervals) {
            int start = interval[0]; // Start point of the current interval
            int end = interval[1]; // End point of the current interval

            if (start > second) { // If there's no overlap, add two new points to the intersection
                count += 2;
                first = end - 1; // Update the first point
                second = end; // Update the second point
            } else if (start > first) { // If there's a partial overlap, add one new point to the intersection
                count++;
                // Update the first point based on whether the second point is equal to the end of the interval
                first = (second != end) ? second : end - 1;
                second = end; // Update the second point
            }
        }

        return count; // Return the count of the minimum intersection size among the intervals
    }
}
