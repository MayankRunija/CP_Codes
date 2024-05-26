class Solution {
    public String reformat(String s) {
        int n = s.length();
        char[] digits = new char[n];
        char[] alpha = new char[n];
        int alphaIndex = 0;
        int digitsIndex = 0;
        
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits[digitsIndex++] = s.charAt(i);
            } else {
                alpha[alphaIndex++] = s.charAt(i);
            }
        }
        
        if (Math.abs(digitsIndex - alphaIndex) > 1) {
            return "";
        }
        
        StringBuilder resultBuilder = new StringBuilder();
        
        if (digitsIndex >= alphaIndex) {
            for (int i = 0; i < alphaIndex; i++) {
                resultBuilder.append(digits[i]);
                resultBuilder.append(alpha[i]);
            }
            if (digitsIndex > alphaIndex) {
                resultBuilder.append(digits[digitsIndex - 1]);
            }
        } else {
            for (int i = 0; i < digitsIndex; i++) {
                resultBuilder.append(alpha[i]);
                resultBuilder.append(digits[i]);
            }
            resultBuilder.append(alpha[alphaIndex - 1]);
        }
        
        return resultBuilder.toString();
    }
}
