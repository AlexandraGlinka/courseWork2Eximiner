package java.pro.sky.java.course2.coursework2examiner.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.pro.sky.java.course2.coursework2examiner.model.Question;
import java.pro.sky.java.course2.coursework2examiner.service.ExaminerService;
import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExaminerController {
    private final ExaminerService examinerService;

    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/getAll/{amount}") // адрес типа http://localhost:8080/example/Alex
    public Collection<Question> getAllQuastions(@PathVariable Integer amount) {
        return examinerService.getQuastions(amount);
    }
}
