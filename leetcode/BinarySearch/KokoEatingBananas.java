class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       long sum = 0;
        for (int n : piles) {
            sum += n;
        }
        int min = (int) Math.ceilDiv(sum, h);
        int max = (int) Math.ceilDiv(sum, h - piles.length + 1);
        int mid = 0;
        while (min < max) {
            mid = (max + min)/2;
            int time = 0;
            for (int i : piles) {
                time += (i + mid - 1)/mid;
                if (time > h) {
                    break;
                }
            }
            if (time > h) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return max;
    }
}
