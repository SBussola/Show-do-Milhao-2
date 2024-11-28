package com.vckb.showdomilhao.controllers;

import com.vckb.showdomilhao.entities.Pergunta;
import com.vckb.showdomilhao.enums.Nivel;
import com.vckb.showdomilhao.repositories.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntasController {

    @Autowired
    private PerguntaRepository perguntaRepository;


    @GetMapping("/{nivel}")
    public List<Pergunta> listarPerguntasPorNivel(@PathVariable Nivel nivel) {

        List<Pergunta> perguntas = perguntaRepository.findByNivel(nivel);

        // Embaralha para garantir que as perguntas sejam aleatórias
        Collections.shuffle(perguntas);

        // Retorna as 5 primeiras perguntas para o nível escolhido
        return perguntas.subList(0, 5);
    }

}
