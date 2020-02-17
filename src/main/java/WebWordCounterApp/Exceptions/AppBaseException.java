package WebWordCounterApp.Exceptions;

public class AppBaseException extends Exception {

    public AppBaseException() {
    }

    public AppBaseException(final String message) {
        super(message);
    }

    public AppBaseException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AppBaseException(final Throwable cause) {
        super(cause);
    }

    public AppBaseException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
