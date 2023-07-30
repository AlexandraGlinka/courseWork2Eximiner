package java.pro.sky.java.course2.coursework2examiner.service;

import java.pro.sky.java.course2.coursework2examiner.model.Question;
import java.pro.sky.java.course2.coursework2examiner.repository.QuestionRepository;
import java.util.Collection;

public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionRepository questionRepository;

    public ExaminerServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Collection<Question> getQuastions(Integer amount) {
        return questionRepository.getAllQuestions();
    }
}
