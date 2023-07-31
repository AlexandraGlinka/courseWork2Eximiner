package java2.pro.sky.java.course2.coursework2examiner.controllers;

import java2.pro.sky.java.course2.coursework2examiner.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java2.pro.sky.java.course2.coursework2examiner.service.ExaminerService;
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
