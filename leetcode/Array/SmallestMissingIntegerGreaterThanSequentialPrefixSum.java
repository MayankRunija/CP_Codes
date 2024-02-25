class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
        for (int item : nums){
            num_set.add(item);
        }
        int summ = nums[0];
        int idx = 1;
        while (idx<nums.length && nums[idx] == nums[idx-1]+1){
            summ+=nums[idx];
            idx++;
        }
        while (num_set.contains(summ)){
            summ++;
        }

        return summ;
    }
}
