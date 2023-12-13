class Solution {
    public int maximumWealth(int[][] accounts) {
        int[][] ip = accounts;
        int wealth = 0;
        
        for(int i=0; i < ip.length; i++){
            int sum = 0;
            for(int j=0; j < ip[i].length; j++){
                sum += ip[i][j];
            }
            if(sum > wealth)
                wealth = sum;
        }
        return wealth;
    }

}
