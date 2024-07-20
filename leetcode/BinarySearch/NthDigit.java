class Solution {
    public int findNthDigit(int n) {
        if(n<=9)
            return n;
        Map<Integer, Long> digitToCount = new HashMap<>(){{
            put(1, 9l);
            put(2, 90l);
            put(3, 900l);
            put(4, 9_000l);
            put(5, 90_000l);
            put(6, 900_000l);
            put(7, 9_000_000l);
            put(8, 90_000_000l);
            put(9, 900_000_000l);
            put(10, 9_000_000_000l);
        }};
        
        int digits = 1;
        while(n >= digitToCount.get(digits) * digits){
            n -= digitToCount.get(digits) * digits;
            digits++;
        }
        if(n==0)
            return 9;
        int start = (int) (digitToCount.get(digits) / 9);
        
        // full digits n
        int skip = (n / digits); 
        
        // left n
        n %= digits; 
        
        if(n == 0)
            return (skip-1) % 10;
        
        int number = start + skip;
        
        // to count n backwards
        n = digits - n; 
        
        while((n--) != 0)
            number /= 10;
        
        return number % 10;
    }
}
