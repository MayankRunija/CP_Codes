import java.util.*;
import java.util.stream.Collectors;

class Solution {
    private final Map<Integer, Set<Integer>> langToPeople = new HashMap<>();
    private int mostSpoken = -1;
    private int mostSpokenCount = 0;
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Map<Integer, Set<Integer>> peopleToLanguages = initLanguages(languages);  //O(n)
        Set<Map.Entry<Integer,Integer>> cantSpeak = getRelationships(friendships, peopleToLanguages); //o(m*n)
        int learners = 0;
        for (Map.Entry<Integer, Integer> friends: cantSpeak) { //o(m)
            Set<Integer> lang1 = peopleToLanguages.getOrDefault(friends.getKey(), new HashSet<>());
            Set<Integer> lang2 = peopleToLanguages.getOrDefault(friends.getValue(), new HashSet<>());
            learners += learnLanguage(peopleToLanguages, friends.getKey(), lang1);
            learners += learnLanguage(peopleToLanguages, friends.getValue(), lang2);
        }
        return learners;
    }

    private Map<Integer, Set<Integer>> initLanguages(int[][] languages) {
        Map<Integer, Set<Integer>> peopleToLanguages = new HashMap<>();
        for (int i = 0; i < languages.length; i++) {
            peopleToLanguages.put(i + 1, Arrays.stream(languages[i]).boxed().collect(Collectors.toSet()));
        }
        return peopleToLanguages;
    }

    private Set<Map.Entry<Integer,Integer>> getRelationships(int[][] friendships, Map<Integer, Set<Integer>> peopleToLanguages) {
        Set<Map.Entry<Integer,Integer>> cantSpeak = new HashSet<>();
        for (int[] friendship: friendships) {
            Set<Integer> lang1 = peopleToLanguages.getOrDefault(friendship[0], new HashSet<>());
            Set<Integer> lang2 = peopleToLanguages.getOrDefault(friendship[1], new HashSet<>());
            if (Collections.disjoint(lang1, lang2)) {
                cantSpeak.add(new AbstractMap.SimpleEntry<>(friendship[0], friendship[1]));
                addPeopleToLang(friendship[0], lang1);
                addPeopleToLang(friendship[1], lang2);
            }
        }
        return cantSpeak;
    }

    private void addPeopleToLang(int friend, Set<Integer> languages) {
        for (int lang: languages) {
            langToPeople.computeIfAbsent(lang, e-> new HashSet<>()).add(friend);
            if (mostSpokenCount < langToPeople.get(lang).size()) {
                mostSpoken = lang;
                mostSpokenCount = langToPeople.get(lang).size();
            }
        }
    }

    private int learnLanguage(Map<Integer, Set<Integer>> peopleToLanguages, int friend, Set<Integer> lang) {
        if (!lang.contains(mostSpoken)) {
            peopleToLanguages.computeIfAbsent(friend, e-> new HashSet<>()).add(mostSpoken);
            return 1;
        }
        return 0;
    }
}
