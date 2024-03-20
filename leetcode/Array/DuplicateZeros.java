class Solution {
    public void duplicateZeros(int[] arr) {
        // We need to have memo to keep all integers that should be inserted
        int[] memo = new int[arr.length];
        boolean duplicate = false;
        int read = 0;
        int write = 0;
        for (int i = 0; i < arr.length; i++){
            if (duplicate){
                memo[write++] = arr[i];
                arr[i] = 0;
            } else if (read != write) {
                memo[write++] = arr[i];
                arr[i] = memo[read++];
            }

            if (arr[i] == 0) {
                duplicate = !duplicate;
            }
        }
    }
}
