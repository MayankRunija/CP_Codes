class Solution {
    public int maxProduct(String[] words) {
        final int[] flags = new int[words.length];
        final int[] length = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            flags[i] = toFlag(words[i]);
            length[i] = words[i].length();
        }

        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((flags[i] & flags[j]) == 0) {
                    final int product = length[i] * length[j];
                    if (product > max) max = product;
                }
            }
        }
        return max;  
    }

    private static int toFlag(String s) {
        int flags = 0;
        for (int i = 0; i < s.length(); i++) {
            flags |= 1 << (s.charAt(i) - 'a');
        }
        return flags;
    }
}
