package java2.pro.sky.java.course2.coursework2examiner.service;

import java2.pro.sky.java.course2.coursework2examiner.exceptions.AmountBiggerThanQuestionsSet;
import java2.pro.sky.java.course2.coursework2examiner.model.Question;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }
    @Override
    public Set<Question> getQuastions(Integer amount) {
        if (amount > questionService.getAllQuestions().size()) {
            throw new AmountBiggerThanQuestionsSet();
        }
        Set<Question> questionSet = new HashSet<>();
        while (questionSet.size() < amount) {
//            Question questionRandom = questionService.getRandomQuestion();
//            if (!questionSet.contains(questionRandom)) {
//                questionSet.add(questionService.getRandomQuestion());
//            }
//            else continue;
            questionSet.add(questionService.getRandomQuestion());
        }
        return questionSet;
    }
}
