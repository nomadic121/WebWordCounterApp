package WebWordCounterApp.Handlers;

import WebWordCounterApp.Exceptions.AppBadArgumentException;

import java.util.Arrays;

public class ArgHandler {

    private final String[] args;

    private String url;

    private String path;

//    private final String URLMATCHER = null;

//    private final String PATHATCHER = null;

    public ArgHandler(final String[] args) throws AppBadArgumentException {
        this.args = args;
        if (args != null && args.length > 0) {
            parse();
        } else {
            throw new AppBadArgumentException("Arguments not set.");
        }
    }

    private void parse() throws AppBadArgumentException {
        try {
            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "-u":
                        url = args[i+1].replaceAll("\"", "");
                        break;
                    case "-o":
                        path = args[i+1].replaceAll("\"", "");
                        break;
                }
            }
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            throw new AppBadArgumentException("Arguments parse error. args: "
                    + Arrays.deepToString(args), e);
        }
        checkURL();
        checkPath();
    }

    public String getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    private void checkURL() throws AppBadArgumentException {
        if (url != null && !url.isEmpty()
                && url.startsWith("http")
//                && url.matches(URLMATCHER)
        ) {
            this.url = url;
        } else {
            throw new AppBadArgumentException("Arguments parse error, url not correct. args: "
                    + Arrays.deepToString(args));

        }
    }

    private void checkPath() throws AppBadArgumentException {
        if (path != null && !path.isEmpty()
                && path.contains(".html")
//                && out.matches(PATHATCHER)
        ) {
            this.path = path;
        } else {
            throw new AppBadArgumentException("Arguments parse error, output file name not correct. args: "
                    + Arrays.deepToString(args));

        }
    }

}
