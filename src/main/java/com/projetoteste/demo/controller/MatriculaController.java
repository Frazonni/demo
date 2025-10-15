package com.projetoteste.demo.controller;

import com.projetoteste.demo.model.Matricula;
import com.projetoteste.demo.service.MatriculaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    private final MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @GetMapping
    public List<Matricula> listarTodos() {
        return matriculaService.listarTodos();
    }

    @PostMapping
    public Matricula salvar(@RequestBody Matricula matricula) {
        return matriculaService.salvar(matricula);
    }
}