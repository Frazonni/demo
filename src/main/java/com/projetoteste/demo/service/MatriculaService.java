package com.projetoteste.demo.service;

import com.projetoteste.demo.model.Matricula;
import com.projetoteste.demo.repository.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {
    private final MatriculaRepository matriculaRepository;

    public MatriculaService(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    public List<Matricula> listarTodos() {
        return matriculaRepository.findAll();
    }

    public Matricula salvar(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }
}