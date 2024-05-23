class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        boolean[] seen = new boolean[26];
        int[] frq = new int[26];

        for (int i = 0; i < n; i++)
            frq[s.charAt(i) - 'a']++;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            frq[c - 'a']--;

            if (seen[c - 'a'])
                continue;

            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > c && frq[sb.charAt(sb.length() - 1) - 'a'] != 0) {
                seen[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

            sb.append(c);
            seen[c - 'a'] = true;
        }

        return sb.toString();
    }
}
