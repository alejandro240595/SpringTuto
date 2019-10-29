package com.mongo.pe.mongoapp.service.Impl;

import com.mongo.pe.mongoapp.model.entity.Student;
import com.mongo.pe.mongoapp.repository.StudentRepository;
import com.mongo.pe.mongoapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;

@Service //no olvidar atte: el maricon
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository  studentRepository;


    @Override
    public Flux<Student> findAllStudent() {
        return studentRepository.findAll().
                repeat(500)
                .delayElements(Duration.ofMillis(1000));
    }

    @Override
    public Mono<Student> saveStudent(Student student) {
        student.setCreateDate(LocalDateTime.now());
        return studentRepository.save(student);
    }
}
