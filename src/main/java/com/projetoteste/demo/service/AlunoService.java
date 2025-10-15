package com.projetoteste.demo.service;

import com.projetoteste.demo.model.Aluno;
import com.projetoteste.demo.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}