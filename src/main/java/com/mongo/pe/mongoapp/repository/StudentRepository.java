package com.mongo.pe.mongoapp.repository;

import com.mongo.pe.mongoapp.model.entity.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {
Flux<Student> findByNameLike();

}
