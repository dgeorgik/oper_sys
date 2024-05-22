package com.example.zachet_admin_oc.controller;

import org.springframework.web.bind.annotation.*;
import com.example.zachet_admin_oc.model.Exam;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/exams")
public class ExamsController {

    @GetMapping("/getAllExams")
    public List<Exam> getAllExams() {
        List<Exam> exams = new ArrayList<>();
        Exam some_exam = new Exam(1, "Some exam");
        exams.add(some_exam);
        return exams;
    }

}

