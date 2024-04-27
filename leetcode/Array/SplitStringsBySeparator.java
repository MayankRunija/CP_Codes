class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c != separator)
                    text.append(c);
                else if (!text.isEmpty()){
                    result.add(text.toString());
                    text = new StringBuilder(); 
                }
            }
            if (!text.isEmpty())
                result.add(text.toString());
        }
        return result;
    }
}
