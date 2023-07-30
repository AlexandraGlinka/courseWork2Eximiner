package java.pro.sky.java.course2.coursework2examiner.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.pro.sky.java.course2.coursework2examiner.exceptions.QuestionAlreadyAddedException;
import java.pro.sky.java.course2.coursework2examiner.exceptions.QuestionNotExistException;
import java.pro.sky.java.course2.coursework2examiner.model.Question;
import java.pro.sky.java.course2.coursework2examiner.repository.QuestionRepository;


public class QuestionServiceTest {
    private QuestionService questionService;
    private QuestionRepository questionRepository;

    @BeforeEach
    private void setUp() {
        questionRepository = Mockito.mock(QuestionRepository.class);
        questionService = new QuestionServiceImpl(questionRepository);
        }

    @Test
    void shouldAddQuestionWhenItDoesntExist() {
        Question question = new Question("Question 5", "Answer 5");
        questionService.addQuestion(question);

        Assertions.assertTrue(questionService.getAllQuestions().contains(question));
    }

    @Test
    void shouldThrowExceptionWhenQuestionExists() {
        Question question = new Question("Question 1", "Answer 1");
        questionService.addQuestion(question);

        Assertions.assertThrows(QuestionAlreadyAddedException.class, () ->
                questionService.addQuestion(question));
    }

    @Test
    void whouldRemoveQuestionWhenExists() {
        Question question = new Question("Question 1", "Answer 1");
        questionService.addQuestion(question);
        questionService.removeQuestion(question);

        Assertions.assertTrue(!questionService.getAllQuestions().contains(question));
    }

    @Test
    void shouldThrowExceptionWhenQuestionDoesntExist() {
        Assertions.assertThrows(QuestionNotExistException.class, () ->
                questionService.removeQuestion(new Question("Question 1", "Answer 1")));
    }
}
