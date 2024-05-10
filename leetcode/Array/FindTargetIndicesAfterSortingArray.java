class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int[] counter = new int[101];
        for (int num: nums) counter[num]++;

        List<Integer> out = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < 101; i++) {
            if (i == target) {
                int total = counter[i];
                for (int j = 0; j < total; j++) {
                    out.add(count++);
                }
            } else {
                count += counter[i];
            }
        }

        return out;
    }
}
