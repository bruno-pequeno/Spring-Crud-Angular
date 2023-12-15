package com.bruno.crudspring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_cursos")
public class Course {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome", length = 200, nullable = false)
    private String name;

    @Column(name = "categoria", length = 20, nullable = false)
    private String category;
}
