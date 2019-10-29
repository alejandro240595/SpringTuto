package com.mongo.pe.mongoapp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

// @Entity no existe ni entidades, ni colecciones.
@Document("student")

public class Student {


    private String id;
    private String name;
    private String lastName;
    private LocalDateTime createDate;

}
