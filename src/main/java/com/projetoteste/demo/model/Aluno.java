package com.projetoteste.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
}