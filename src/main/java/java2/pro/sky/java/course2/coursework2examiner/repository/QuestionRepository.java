package java2.pro.sky.java.course2.coursework2examiner.repository;

import java2.pro.sky.java.course2.coursework2examiner.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question addQuestion(Question question);
    Question removeQuestion(Question question);
    Collection<Question> getAllQuestions();
}
