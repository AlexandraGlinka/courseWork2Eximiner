package java.pro.sky.java.course2.coursework2examiner.service;

import org.springframework.stereotype.Service;

import java.pro.sky.java.course2.coursework2examiner.model.Question;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;
    private final Collection<QuestionService> questionServiceCollection;

    public ExaminerServiceImpl(QuestionService questionService, Collection<QuestionService> questionServiceCollection) {
        this.questionService = questionService;
        this.questionServiceCollection = questionServiceCollection;
    }
    @Override
    public Collection<Question> getQuastions(Integer amount) {
        questionServiceCollection.add((QuestionService) questionService.getRandomQuestion());
        return Collections.unmodifiableCollection(questionServiceCollection);
    }
}
