class Solution {
    public long beautifulSubarrays(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] ^ nums[i];
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        long ret = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int curr = prefix[i];
            ret += map.getOrDefault(curr, 0);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        return ret;
    }   
}
