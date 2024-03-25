class Solution {
    public int[] findMissingAndRepeatedValues(int[][] nums) {
        int[] ans = new int[2];
        int n = nums.length * nums.length;
        int[] arr = new int[n];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                arr[k] = nums[i][j];
                k++;
            }
        }
        for (int i = 1; i <= n; i++) {
            int temp = -1;
            int l = i;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) temp = i;
                if (l < n && arr[l] == arr[i-1]) {
                    ans[0] = arr[l];
                }
                l++;
            }
            if(temp == -1) ans[1] = i;
        }
        return ans;
    }
}
