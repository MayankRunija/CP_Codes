class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides, (a,b)->(a[1]-b[1]));
        TreeMap<Integer, Long> dp=new TreeMap<>();
        dp.put(0, 0L);
        for(int[] ride:rides){
            Long currProfit = dp.floorEntry(ride[0]).getValue() + (ride[1]-ride[0]+ride[2]);
            if(currProfit>dp.lastEntry().getValue()){
                dp.put(ride[1], currProfit);
            }
        }
        return dp.lastEntry().getValue();
    }
}
