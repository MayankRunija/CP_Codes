class Solution {
    public char findTheDifference(String s, String t) {
        // XORing (^=) a number with itself cancels out to zero, and XORing a number with zero leaves the number unchanged.
        // XORing a number with another second number and then XORing the result with the second number will give the first number.
        // so the characters that appear in both will cancel each other out, leaving the extra character
        char result = 0;
        for (char c: s.toCharArray()) result ^= c;
        for (char c: t.toCharArray()) result ^= c;
        return result;
    }
}
