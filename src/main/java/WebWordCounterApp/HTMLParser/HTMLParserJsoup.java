package WebWordCounterApp.HTMLParser;

import WebWordCounterApp.Exceptions.AppHTLMParseException;
import WebWordCounterApp.Exceptions.AppPageDownloadExeption;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class HTMLParserJsoup implements HTMLParser {

    @Override
    public String parseHTML(final String url) throws AppHTLMParseException {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new AppHTLMParseException(
                    String.format("Parse saved page error. URL: %s", url), e);
        }
        return parse(doc);
    }

    @Override
    public String parseHTML(final File file) throws AppHTLMParseException {
        Document doc = null;
        try {
            doc = Jsoup.parse(file, "UTF-8");
        } catch (IOException e) {
            throw new AppHTLMParseException(
                    String.format("Parse saved page error. File: %s", file.getPath()), e);
        }
        return parse(doc);
    }

    private String parse (final Document doc) {
        StringBuilder sb = new StringBuilder();

//        Elements element = doc.select("p");
        Elements element = doc.select("body");

        for (Element t : element) {
            sb.append(t.text()).append("\n");
        }
//        sb.append(doc.text());
        return sb.toString();
    }

}
