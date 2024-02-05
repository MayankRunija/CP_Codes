class Solution {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        String div = "/";

        StringBuilder result = new StringBuilder();
        result.append(nums[0]);
        if(n == 1) {
            return result.toString();
        }

        if(n == 2) {
            result.append(div);
            result.append(nums[1]);
            return result.toString();
        }

        result.append(div);
        result.append("(");
        for(int i=1; i<n-1; i++) {
            result.append(nums[i]);
            result.append(div);
        }

        result.append(nums[n-1]);
        result.append(")");
        return result.toString();
    }
}
