class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Finding the minimum and maximum values
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        
        // Computing the GCD using the Euclidean algorithm
        while (min != max) {
            if (min > max) {
                min -= max;
            } else {
                max -= min;
            }
        }
        
        return min; // min (or max) contains the GCD
    }
}
