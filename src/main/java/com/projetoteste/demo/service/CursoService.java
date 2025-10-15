package com.projetoteste.demo.service;

import com.projetoteste.demo.model.Curso;
import com.projetoteste.demo.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    public Curso salvar(Curso curso) {
        return cursoRepository.save(curso);
    }
}