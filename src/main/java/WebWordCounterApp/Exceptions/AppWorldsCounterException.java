package WebWordCounterApp.Exceptions;

public class AppWorldsCounterException extends AppBaseException {

    public AppWorldsCounterException() {
    }

    public AppWorldsCounterException(final String message) {
        super(message);
    }

    public AppWorldsCounterException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AppWorldsCounterException(final Throwable cause) {
        super(cause);
    }

    public AppWorldsCounterException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
