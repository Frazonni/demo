package com.projetoteste.demo.repository;

import com.projetoteste.demo.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}