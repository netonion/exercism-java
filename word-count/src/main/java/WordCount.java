import java.util.HashMap;

class WordCount{

    public HashMap<String, Integer> phrase(String phrase) {
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : phrase.toLowerCase().split("\\W+")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        return count;
    }
}
