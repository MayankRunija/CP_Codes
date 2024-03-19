class Solution {
    public boolean canDistribute(int[] nums, int[] quantity) {
        
        // Use a map to count the numbers, ex: nums:[5,7,4,7,4,7] -> {5:1, 7:3, 4:2}
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0)+1);
        
        // Turn values of the map into array, ex: {5:1, 7:3, 4:2} -> [1, 3, 2]
        int[] dist = new int[freq.size()];
        int idx = 0;
        for (int f : freq.values())
            dist[idx++] = f;
        
	     Arrays.sort(quantity);
        return rec(dist, quantity, quantity.length-1);
    }
    
    // try to fullfill the j-th order quantity
    private boolean rec(int[] dist, int[] quantity, int j) {
        
        // stop condition. We've fulfilled all the order quantities.
        if (j == -1)
            return true;
        
        Set<Integer> used = new HashSet<>();
        for (int i = 0 ; i < dist.length ; ++i) {
		
			
            if (dist[i] >= quantity[j] && used.add(dist[i])) {
                dist[i] -= quantity[j];
                if (rec(dist, quantity, j-1))
                    return true;
                dist[i] += quantity[j];
            }
        }
        return false;
    }
}
