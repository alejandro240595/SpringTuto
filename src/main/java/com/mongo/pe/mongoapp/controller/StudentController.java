package com.mongo.pe.mongoapp.controller;

import com.mongo.pe.mongoapp.model.entity.Student;
import com.mongo.pe.mongoapp.repository.StudentRepository;
import com.mongo.pe.mongoapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/crud")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Student> list() {
        return studentService.findAllStudent();

    }

    @PostMapping("/save")
    public Mono<Student> save(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }


}
