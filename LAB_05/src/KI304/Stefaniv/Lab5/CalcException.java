package KI304.Stefaniv.Lab5;

/**
 * The CalcException class represents a custom exception that can be thrown during equation calculation.
 * It extends the base Exception class.
 */
public class CalcException extends Exception {

    /**
     * Constructs a CalcException with a specified error message and a cause.
     *
     * @param message The error message associated with the exception.
     * @param cause   The cause of the exception, usually an exception that triggered this one.
     */
    public CalcException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a CalcException with a specified cause.
     *
     * @param cause The cause of the exception, usually an exception that triggered this one.
     */
    public CalcException(String cause) {
        super(cause);
    }
}


