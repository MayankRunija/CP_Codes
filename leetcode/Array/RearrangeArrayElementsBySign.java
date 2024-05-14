public class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        List<Integer> v3 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                v1.add(nums[i]);
            } else {
                v2.add(nums[i]);
            }
        }
        for (int i = 0; i < v1.size(); i++) {
            v3.add(v1.get(i));
            v3.add(v2.get(i));
        }

        return v3.stream().mapToInt(Integer::intValue).toArray();
    }
}
