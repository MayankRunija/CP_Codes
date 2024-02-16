class Solution {
        public int buyChoco(int[] prices, int money) {
        int one=findMin(prices, -1), two=findMin(prices, one);
        if(prices[one]+prices[two]<=money)
            return money-prices[one]-prices[two];
        return money;
    }

    private int findMin(int[] prices, int idx) {
        int res=(idx==0)?1:0;
        for(int i=0; i<prices.length; i++){
            if(i==idx)
                continue;
            if(prices[i]<prices[res]){
                res=i;
            }
        }
        return res;
    }
	
    }
}
