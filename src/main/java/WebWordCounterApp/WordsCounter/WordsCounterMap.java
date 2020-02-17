package WebWordCounterApp.WordsCounter;

import java.util.HashMap;
import java.util.Map;

public class WordsCounterMap implements WordsCounter {

    private final String SPLTRE = "[\\Q ,.!?\";:[]()\\E\\n\\r\\t]+";

//    private final String wordFilter = "[\\p{L}\\p{N}]+"; //if constaint only one or more character or number
    private final String wordFilter = "[\\p{L}]+"; //if constaint only character, one or more

    protected HashMap<String, Integer> words = new HashMap<>();

    @Override
    public void add(final String word) {
        final String wrd = wordNormalize(word);
        if (isCorrect(wrd)) {
            if (words.containsKey(wrd)) {
                words.put(wrd, words.get(wrd) + 1);
            } else {
                words.put(wrd, 1);
            }
        }
    }

    @Override
    public void parseText(final String text) {
        add(text.split(SPLTRE));
    }

    @Override
    public String getStatistic() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> element : words.entrySet()) {
            sb.append(element.getKey()).append(" - ").append(element.getValue()).append("\n");
        }
        return sb.toString();
    }

    private String wordNormalize (final String word) {
        return word.trim().toUpperCase();
    }

    private boolean isCorrect (final String word) {
        return (word != null
                && !word.isEmpty()
                && word.matches(wordFilter)
                );
    }

}
