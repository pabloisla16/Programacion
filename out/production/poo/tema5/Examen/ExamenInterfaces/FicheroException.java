package tema5.ExamenInterfaces;

public class FicheroException extends Exception {
    public FicheroException() {
    }

    public FicheroException(String message) {
        super(message);
    }

    public FicheroException(String message, Throwable cause) {
        super(message, cause);
    }

    public FicheroException(Throwable cause) {
        super(cause);
    }

    public FicheroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
