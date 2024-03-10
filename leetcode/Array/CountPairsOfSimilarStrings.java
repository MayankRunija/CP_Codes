class Solution {
    public int similarPairs(String[] words) {
        var map = new HashMap<Integer, Integer>();
        for (var word : words) {
            int bitset = 0;
            for (int i=0; i<word.length(); i++) {
                int index = word.charAt(i)-'a';
                bitset |= (1 << index);
            }
            map.put(bitset, map.getOrDefault(bitset, 0) + 1);
        }
        
        int pairs = 0;
        for (var entry: map.entrySet()) {
            var count = entry.getValue();
            if (count <= 1) continue;
            pairs += (count * (count-1)) / 2;
        }
        return pairs;
    }
}
