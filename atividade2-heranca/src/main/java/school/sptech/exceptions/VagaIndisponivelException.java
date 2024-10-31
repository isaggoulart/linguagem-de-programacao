package school.sptech.exceptions;

public class VagaIndisponivelException extends RuntimeException {
    public VagaIndisponivelException(String message) {
        super(message);
    }

    public VagaIndisponivelException(String message, Throwable cause) {
        super(message, cause);
    }

    public VagaIndisponivelException(Throwable cause) {
        super(cause);
    }

    public VagaIndisponivelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public VagaIndisponivelException() {
    }
}
