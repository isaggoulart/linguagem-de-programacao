package school.sptech.exceptions;

public class DevNaoEncontradoException extends RuntimeException {

    public DevNaoEncontradoException(String message) {
        super(message);
    }

    public DevNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DevNaoEncontradoException(Throwable cause) {
        super(cause);
    }

    public DevNaoEncontradoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DevNaoEncontradoException() {
    }
}
