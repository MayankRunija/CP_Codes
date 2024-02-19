class Solution {
    public int returnToBoundaryCount(int[] nums) {
    long diff = 0;
    int res = 0;
    for (int n : nums) {
        diff += n;

        if (diff == 0) res++;
    }
    return res;
}
    }
