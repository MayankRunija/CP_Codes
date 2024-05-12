class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (current == s.charAt(j)) {
                    int distBetween = j - i - 1;
                    if (distBetween != distance[current - 'a']) {
                        return false; // Return false if the distance does not match
                    }
                }
            }
        }
        return true; // Return true if all characters match the distances
    }
}
