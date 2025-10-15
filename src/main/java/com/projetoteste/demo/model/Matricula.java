package com.projetoteste.demo.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Curso curso;
}