package me.gnat008.commandsigns.exceptions;

/**
 * Created by Gnat008 on 5/27/2014.
 */
public class SignDatabaseException extends Exception {

    private static final long serialVersionUID = 26L;

    public SignDatabaseException() {
        super();
    }

    public SignDatabaseException(String message) {
        super(message);
    }

    public SignDatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignDatabaseException(Throwable cause) {
        super(cause);
    }
}
