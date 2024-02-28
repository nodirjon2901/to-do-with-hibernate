package uz.nt.todowithhibernate.exception;

public class WrongPasswordOrUsernameException extends RuntimeException {

    public WrongPasswordOrUsernameException(String message) {
        super(message);
    }
}
