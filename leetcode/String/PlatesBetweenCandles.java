class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        TreeSet<Integer> candles = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                candles.add(i);
            }
        }

        int[] prefixSum = new int[s.length()];
        prefixSum[0] = (s.charAt(0) == '*') ? 1 : 0;

        for(int i = 1;i < s.length(); i++) {
            prefixSum[i] = prefixSum[i - 1] + ((s.charAt(i) == '*') ? 1 : 0);
        }

        int[] ans = new int[queries.length];
        int i = 0;

        for(int[] it : queries){
            Integer lo = candles.ceiling(it[0]);
            Integer hi = candles.floor(it[1]);

            if(lo == null || hi == null || lo >= hi || lo > it[1] || hi < it[0]) {
                ans[i++] = 0;
                continue;
            }

            ans[i++] = prefixSum[hi] - prefixSum[lo];
        }

        return ans;
    }
}
