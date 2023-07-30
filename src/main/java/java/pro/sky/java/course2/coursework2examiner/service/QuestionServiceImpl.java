package java.pro.sky.java.course2.coursework2examiner.service;

import org.springframework.stereotype.Service;

import java.pro.sky.java.course2.coursework2examiner.model.Question;
import java.pro.sky.java.course2.coursework2examiner.repository.QuestionRepository;
import java.util.Collection;
import java.util.Random;

@Service
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final Random random;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
        this.random = new Random();
    }
    @Override
    public Question addQuestion(Question question) {
        return questionRepository.addQuestion(question);
    }

    @Override
    public Question removeQuestion(Question question) {
        return questionRepository.removeQuestion(question);
    }

    @Override
    public Collection<Question> getAllQuestions() {
        return questionRepository.getAllQuestions();
    }

    @Override
    public Integer getRandomQuestion() {
        Integer[] arrayQuestions = questionRepository.getAllQuestions().
                toArray(new Integer[questionRepository.getAllQuestions().size()]); // из сета делаем array
        Integer randomQuestion = random.nextInt(questionRepository.getAllQuestions().size()); // рандомное число в размере сета
        return arrayQuestions[randomQuestion];
    }
}
