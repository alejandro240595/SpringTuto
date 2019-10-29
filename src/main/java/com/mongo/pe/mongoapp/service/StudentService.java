package com.mongo.pe.mongoapp.service;

        import com.mongo.pe.mongoapp.model.entity.Student;
        import reactor.core.publisher.Flux;
        import reactor.core.publisher.Mono;

public interface StudentService {

    Flux<Student> findAllStudent();
    Mono<Student> saveStudent(Student student);

}
