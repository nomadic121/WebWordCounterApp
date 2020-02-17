package WebWordCounterApp.WordsCounter;

public interface WordsCounter {

    void parseText (final String text);

    void add (final String word);

    default void add(final String[] words) {
        if (words != null){
            for (String element : words) {
                add(element);
            }
        }
    }

    String getStatistic ();

}
