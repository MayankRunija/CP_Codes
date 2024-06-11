class Solution {
    public int maxProduct(int[] nums) {
        // Initialize
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the two largest elements.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                // If the current element is greater than the largest, update both largest and secondLargest.
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest) {
                // If the current element is greater than the second largest, update only secondLargest.
                secondLargest = nums[i];
            }
        }

        // Calculate the maximum product of two largest elements minus 1.
        int ans = (largest - 1) * (secondLargest - 1);
        return ans;
    }
}
