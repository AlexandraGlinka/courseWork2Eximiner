package java.pro.sky.java.course2.coursework2examiner.service;

import java.pro.sky.java.course2.coursework2examiner.model.Question;
import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuastions(Integer amount);
}
