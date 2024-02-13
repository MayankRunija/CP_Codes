class Solution {
    public int minMoves(int[] nums) {

        int min = Integer.MAX_VALUE;
        for(int i: nums){ if(i<min) min=i;}

        int diff = 0;

        for(int i:nums){
            diff += (i-min);
        }
        
        return diff;
    }
}
