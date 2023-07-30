package java.pro.sky.java.course2.coursework2examiner.repository;

import java.pro.sky.java.course2.coursework2examiner.model.Question;
import java.util.Collection;

public interface QuestionRepository {
    Question addQuestion(Question question);
    Question removeQuestion(Question question);
    Collection<Question> getAllQuestions();
}
