package java.pro.sky.java.course2.coursework2examiner.exceptions;

public class QuestionAlreadyAddedException extends RuntimeException {
    public QuestionAlreadyAddedException() {
    }

    public QuestionAlreadyAddedException(String message) {
        super(message);
    }

    public QuestionAlreadyAddedException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionAlreadyAddedException(Throwable cause) {
        super(cause);
    }
}
