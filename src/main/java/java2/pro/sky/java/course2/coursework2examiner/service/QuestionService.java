package java2.pro.sky.java.course2.coursework2examiner.service;

import java2.pro.sky.java.course2.coursework2examiner.model.Question;

import java.util.Collection;

public interface QuestionService {
    //Question addQuestionAndAnswer(String question, String answer);

    Question addQuestion(Question question);

    Question removeQuestion(Question question);

    Collection<Question> getAllQuestions();

    Question getRandomQuestion();
}
