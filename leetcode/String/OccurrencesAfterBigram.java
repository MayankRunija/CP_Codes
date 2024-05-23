
public class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" "); // Split the text into words.
        List<String> ans = new ArrayList<>(); // Use a dynamic list to collect answers.

        // Iterate through the words, stopping at the third-to-last to avoid out-of-bounds access.
        for (int i = 0; i <= words.length - 3; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                ans.add(words[i + 2]); // Add the word following the first and second words to the answer list.
            }
        }

        // Convert the List to an array of strings to match the return type.
        return ans.toArray(new String[0]);
    }
}
