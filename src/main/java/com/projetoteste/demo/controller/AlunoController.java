package com.projetoteste.demo.controller;

import com.projetoteste.demo.model.Aluno;
import com.projetoteste.demo.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }
}