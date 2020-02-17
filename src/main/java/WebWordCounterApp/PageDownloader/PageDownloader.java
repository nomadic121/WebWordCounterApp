package WebWordCounterApp.PageDownloader;

import WebWordCounterApp.Exceptions.AppPageDownloadExeption;

import java.net.URL;

public interface PageDownloader {

    void downloadPage (final String url, final String out) throws AppPageDownloadExeption;

}
