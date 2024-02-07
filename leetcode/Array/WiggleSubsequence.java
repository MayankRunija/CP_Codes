// The approach for this question is to find difference between every consecutive elements of array i.e(nums[i+1]-nums[i] in the code) to check the difference is positive or negative , by doing this also check the pattern of positive-negative or negative-positive , do this by storing every current difference of elements and compare it with previous difference and check the pattern of pos-neg or neg-pos.
// Count this for how much elements of the given array this pattern is following and simply return the count :)

// TC:- O(N)
// SC:- O(1) 
class Solution {
    public int wiggleMaxLength(int[] nums) {
        // base case
        if (nums.length < 2)
            return nums.length;

        int count = 1;
        int diff = 0; // stores the previous difference
        for (int i = 1; i < nums.length; i++) {
            int current_diff = nums[i] - nums[i - 1]; // update of current difference

            if ((current_diff > 0 && diff <= 0) || (current_diff < 0 && diff >= 0)) {
                count++;
                diff = current_diff; // update of previous difference
            }
        }
        return count;
    }
}
