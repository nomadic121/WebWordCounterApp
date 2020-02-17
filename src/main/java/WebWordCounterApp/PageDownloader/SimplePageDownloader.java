package WebWordCounterApp.PageDownloader;

import WebWordCounterApp.Exceptions.AppPageDownloadExeption;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class SimplePageDownloader implements PageDownloader {

    @Override
    public void downloadPage(final String url, final String outPath) throws AppPageDownloadExeption {
        try {
            InputStream inputStream = new URL(url).openStream();
            Path out = Paths.get(outPath);
            Files.copy(inputStream, out, StandardCopyOption.REPLACE_EXISTING);
            inputStream.close();
        } catch (IOException e) {
            throw new AppPageDownloadExeption(
                    String.format("Download and save web page error. URL: %s, path: %s", url, outPath), e);
        }
    }

}
