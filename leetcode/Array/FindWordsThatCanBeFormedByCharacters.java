class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int count = 0;

        int[] freqChar = new int[26];

        for(char ch : chars.toCharArray()) {
            freqChar[ch-'a']++;
        }

    
        for(String word : words) {
            int[] freqWord = Arrays.copyOf(freqChar, 26);
            int index=0;

            for(char  ch : word.toCharArray()) {
                if(freqWord[ch - 'a'] > 0) {
                    freqWord[ch-'a']--;
                    index++;
                }
                else {
                    break;
                }
            }
            if(index == word.length()) {
                count += word.length();
            }
        }
        return count;
    }
}
