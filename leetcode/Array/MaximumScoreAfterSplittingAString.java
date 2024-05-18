class Solution {
    public int maxScore(String s) {
        // Initialize variables to track the maximum score, count of zeros on the left, and count of ones on the right
        int maxScore = 0;
        int zerosLeft = 0;
        int onesRight = 0;

        // Calculate the total count of ones in the string
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }

        // Iterate through the string to find the maximum score
        for (int i = 0; i < s.length() - 1; i++) {
            // Update counts based on the current character
            if (s.charAt(i) == '0') {
                zerosLeft++;
            } else {
                onesRight++;
            }

            // Calculate the score for the current split point
            int currentScore = zerosLeft + (totalOnes - onesRight);

            // Update the maximum score if the current score is greater
            maxScore = Math.max(maxScore, currentScore);
        }

        // Return the maximum score after iterating through the entire string
        return maxScore;
    }
}
