class Solution {
    public int myAtoi(String s) {
        // Check for empty spaces
        s = s.trim();
        if(s.length()==0) return 0;
        // check for the sign
        int sign = 1;
        int i = 0;
        char c = s.charAt(0);
        if (c == '-') {
            sign = -1;
            i++;  
        } else if (c == '+') {
            i++; 
        }
        long sum = 0;
        while (i < s.length()) {
            char currChar = s.charAt(i);
            // check for non integer characters
            if (currChar < '0' || currChar > '9') break;
            // check for integer characters
            int a = currChar - '0';
            // formulate the answer
            sum = sum * 10 + a;
            // check for the overflow condition
            if (sign == 1 && sum > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }
        // return the answer with the sign
        return (int) (sign * sum);
    }
}
