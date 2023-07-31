package java2.pro.sky.java.course2.coursework2examiner.service;

import java2.pro.sky.java.course2.coursework2examiner.exceptions.AmountBiggerThanQuestionsSet;
import java2.pro.sky.java.course2.coursework2examiner.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class ExaminerServiceTest {
    private ExaminerService examinerService;
    private QuestionService questionService;

    @BeforeEach
    public void setUp() {
        questionService = Mockito.mock(QuestionService.class);

        Question question1 = new Question("Question 1", "Answer 1");
        Question question2 = new Question("Question 2", "Answer 2");
        Question question3 = new Question("Question 3", "Answer 3");

        Mockito.when(questionService.getAllQuestions()).thenReturn(List.of(question1, question2, question3));

        examinerService = new ExaminerServiceImpl(questionService);


    }

//    private List<Question> questionList() {
//        return List.of(new Question("Question 1", "Answer 1"),
//                new Question("Question 2", "Answer 2"),
//                new Question("Question 3", "Answer 3"),
//                new Question("Question 4", "Answer 4"));
//    }
//    @Test
//    void shouldReturn3QuestionsWhileAmountEquals3() {
//        Assertions.assertTrue(examinerService.getQuastions(3).size() == 3);
//        // Assertions.assertEquals(3, examinerService.getQuastions(3).size());
//    }

    @Test
    void shouldThrowExceptionWhenAmountBiggerThanQuestionListSize() {
        Assertions.assertThrows(AmountBiggerThanQuestionsSet.class, () ->
                examinerService.getQuastions(5));
    }

}
