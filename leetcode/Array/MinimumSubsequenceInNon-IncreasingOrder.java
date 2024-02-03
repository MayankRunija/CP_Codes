class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        int temp = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = nums.length-1; i >=0; i--){
            temp = temp + nums[i];
            al.add(nums[i]);
            if(temp>(sum-temp)){
                return al;
            }
        }
        return al;
    }
}
