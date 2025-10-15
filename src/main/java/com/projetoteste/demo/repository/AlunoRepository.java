package com.projetoteste.demo.repository;
import com.projetoteste.demo.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {}