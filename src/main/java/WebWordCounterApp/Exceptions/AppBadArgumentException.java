package WebWordCounterApp.Exceptions;

public class AppBadArgumentException extends AppBaseException {

    public AppBadArgumentException() {
    }

    public AppBadArgumentException(final String message) {
        super(message);
    }

    public AppBadArgumentException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AppBadArgumentException(final Throwable cause) {
        super(cause);
    }

    public AppBadArgumentException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
