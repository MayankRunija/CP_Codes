class Solution {
    public int hIndex(int[] citations) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : citations) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] bucket = new int[max - min + 1];
        int move = min;
        for (int num : citations) {
            bucket[num - move]++;
        }
        int index = 1;
        int ans = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            while (bucket[i] > 0) {
                if (i + move >= index) {
                    ans++; 
                    index++;
                    bucket[i]--;
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }
}
