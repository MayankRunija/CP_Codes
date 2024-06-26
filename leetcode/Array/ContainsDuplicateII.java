class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
        // map.containsKey(num) will tell whatever ith index that I want, have I seen it before?
            if (map.containsKey(num)) {
                // if I have already seen this number, then check for condition abs(i - j) <= k
                if (i - map.get(num) <= k) {
                    return true;
                // if the condition isn't equal true then update the index of the number with new index 
                } else {
                    map.put(num, i);
                }

            } else {
        // if I have not seen this number before, insert the number with its position in the map
                map.put(num, i);
            }
        }
        // after the complete traversal, if we don't find a pair to satisfy the condition, return false
        return false;
    }
}
