package WebWordCounterApp.HTMLParser;

import WebWordCounterApp.Exceptions.AppHTLMParseException;

import java.io.File;

public interface HTMLParser {

    String parseHTML (final String url) throws AppHTLMParseException;
    String parseHTML (final File file) throws AppHTLMParseException;

    }
