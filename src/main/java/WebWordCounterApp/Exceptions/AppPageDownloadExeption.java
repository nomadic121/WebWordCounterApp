package WebWordCounterApp.Exceptions;

public class AppPageDownloadExeption extends AppBaseException {

    public AppPageDownloadExeption() {
    }

    public AppPageDownloadExeption(final String message) {
        super(message);
    }

    public AppPageDownloadExeption(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AppPageDownloadExeption(final Throwable cause) {
        super(cause);
    }

    public AppPageDownloadExeption(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
