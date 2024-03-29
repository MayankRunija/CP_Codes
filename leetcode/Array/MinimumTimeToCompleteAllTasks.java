class Solution {
    public int findMinimumTime(int[][] tasks) {
        int[] line = new int[2001]; 
        Arrays.sort(tasks, (a, b)->Integer.compare(a[1], b[1])); 
        for (var t : tasks) {
            int lo = t[0], hi = t[1], time = t[2]; 
            for (int x = lo; x <= hi && time > 0; ++x) time -= line[x]; 
            for (int x = hi; x >= lo && time > 0; --x) {
                if (line[x] == 0) {
                    line[x] = 1; 
                    --time; 
                }
            }
        }
        return Arrays.stream(line).sum(); 
    }
}
