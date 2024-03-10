class Solution {
    public void sortColors(int[] nums) {
        int c_0 = 0;
        int c_1 = 0;
        int c_2 = 0;
        for (int i : nums) {
            if (i == 0) {
                c_0++;
            } else if (i == 1) {
                c_1++;
            } else {
                c_2++;
            }
        }
        
        Arrays.fill(nums, 0, c_0, 0);
        Arrays.fill(nums, c_0, c_0 + c_1, 1);
        Arrays.fill(nums, c_0 + c_1, c_0 + c_1 + c_2, 2);
    }
}
