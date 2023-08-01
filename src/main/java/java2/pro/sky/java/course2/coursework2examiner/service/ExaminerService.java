package java2.pro.sky.java.course2.coursework2examiner.service;

import java2.pro.sky.java.course2.coursework2examiner.model.Question;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuastions(Integer amount);
}
