package WordsCounter;

import WebWordCounterApp.WordsCounter.WordsCounter;
import WebWordCounterApp.WordsCounter.WordsCounterMap;
import org.junit.Test;

public class WordsCounterMapTest {

    private final String input = "A relative path path";

    @Test
    public void baseTest () {
        WordsCounter wcs = new WordsCounterMap();
        wcs.parseText(input);
        assert wcs.getStatistic().contains("RELATIVE - 1");
        assert wcs.getStatistic().contains("A - 1");
        assert wcs.getStatistic().contains("PATH - 2");
    }

}
