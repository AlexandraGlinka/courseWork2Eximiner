package java.pro.sky.java.course2.coursework2examiner.service;

import java.pro.sky.java.course2.coursework2examiner.model.Question;
import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuastions(Integer amount);
}
