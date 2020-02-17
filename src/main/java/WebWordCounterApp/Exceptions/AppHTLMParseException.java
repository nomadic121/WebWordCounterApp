package WebWordCounterApp.Exceptions;

public class AppHTLMParseException extends AppBaseException {

    public AppHTLMParseException() {
    }

    public AppHTLMParseException(final String message) {
        super(message);
    }

    public AppHTLMParseException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AppHTLMParseException(final Throwable cause) {
        super(cause);
    }

    public AppHTLMParseException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
