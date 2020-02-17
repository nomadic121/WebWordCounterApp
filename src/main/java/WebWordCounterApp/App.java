package WebWordCounterApp;

import WebWordCounterApp.Exceptions.AppBadArgumentException;
import WebWordCounterApp.Exceptions.AppHTLMParseException;
import WebWordCounterApp.Exceptions.AppPageDownloadExeption;
import WebWordCounterApp.HTMLParser.HTMLParser;
import WebWordCounterApp.HTMLParser.HTMLParserJsoup;
import WebWordCounterApp.Handlers.ArgHandler;
import WebWordCounterApp.PageDownloader.SimplePageDownloader;
import WebWordCounterApp.WordsCounter.WordsCounter;
import WebWordCounterApp.WordsCounter.WordsCounterMap;

import java.io.File;

public class App {

    private HTMLParser parser = new HTMLParserJsoup();
    private WordsCounter wcs = new WordsCounterMap();
    private ArgHandler inputArgs = null;

    public void argsSet(final String[] args) throws AppBadArgumentException {
            inputArgs = new ArgHandler(args);
    }

    public void downloadPage () throws AppPageDownloadExeption {
            new SimplePageDownloader().downloadPage(inputArgs.getUrl(), inputArgs.getPath());
    }

    public void parsePage () throws AppHTLMParseException {
            wcs.parseText(parser.parseHTML(new File(inputArgs.getPath())));
            System.out.println(wcs.getStatistic());
    }
}