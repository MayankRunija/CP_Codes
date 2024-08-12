class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l = 1, r = (long) 1e14; 
        while (l < r) {
            long m = l + (r - l) / 2;  
            long trips = 0; 
            for (int i = 0; i < time.length && trips < totalTrips; i++) {
                trips += m / time[i];
            }
            if (trips < totalTrips) {
                l = m + 1; 
            } else {
                r = m; 
            }
        }
        return l;
    }
}
