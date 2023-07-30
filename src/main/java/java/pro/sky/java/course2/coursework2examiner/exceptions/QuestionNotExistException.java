package java.pro.sky.java.course2.coursework2examiner.exceptions;

public class QuestionNotExistException extends RuntimeException {
    public QuestionNotExistException() {
    }

    public QuestionNotExistException(String message) {
        super(message);
    }

    public QuestionNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionNotExistException(Throwable cause) {
        super(cause);
    }
}
