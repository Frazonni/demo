package com.projetoteste.demo.controller;

import com.projetoteste.demo.model.Curso;
import com.projetoteste.demo.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> listarTodos() {
        return cursoService.listarTodos();
    }

    @PostMapping
    public Curso salvar(@RequestBody Curso curso) {
        return cursoService.salvar(curso);
    }
}