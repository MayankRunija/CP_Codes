class Solution {

public boolean checkZeroOnes(String s) {
    int maxZero = 0;
    int zero = 0;
    int maxOne = 0;
    int one = 0;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '1') {
            one++;
            maxOne = Math.max(one, maxOne);
        } else one = 0;

        if (s.charAt(i) == '0') {
            zero++;
            maxZero = Math.max(zero, maxZero);
        } else zero = 0;
    }
    return maxZero < maxOne;
}}
