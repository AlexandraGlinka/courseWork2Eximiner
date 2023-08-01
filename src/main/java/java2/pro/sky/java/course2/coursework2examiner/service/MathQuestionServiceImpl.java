package java2.pro.sky.java.course2.coursework2examiner.service;

import java2.pro.sky.java.course2.coursework2examiner.model.Question;
import java2.pro.sky.java.course2.coursework2examiner.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class MathQuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    public MathQuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question addQuestion(Question question) {
        return null;
    }

    @Override
    public Question removeQuestion(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAllQuestions() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
