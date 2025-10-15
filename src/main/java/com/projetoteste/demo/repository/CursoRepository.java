package com.projetoteste.demo.repository;

import com.projetoteste.demo.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}