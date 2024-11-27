package com.vckb.showdomilhao.controllers;

import com.vckb.showdomilhao.entities.Pergunta;
import com.vckb.showdomilhao.repositories.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(" * ")
public class PerguntasController {

    @Autowired
    private PerguntaRepository perguntaRepository;

    // Endpoint para pegar as 5 perguntas iniciais
    @GetMapping("/perguntas/{nivel}")
    public List<Pergunta> listarPerguntasPorNivel(@PathVariable int nivel) {
        List<Pergunta> perguntas;

        switch (nivel) {
            case 1:
                perguntas = perguntaRepository.findByNivelId(1);
                break;
            case 2:
                perguntas = perguntaRepository.findByNivelId(2);
                break;
            case 3:
                perguntas = perguntaRepository.findByNivelId(3);
                break;
            case 4:
                perguntas = perguntaRepository.findByNivelId(4);
                break;
            default:
                throw new IllegalArgumentException("Nível inválido.");
        }

        // Embaralha para garantir que as perguntas sejam aleatórias
        Collections.shuffle(perguntas);

        // Retorna as 5 primeiras perguntas para o nível escolhido
        return perguntas.subList(0, 5);
    }

    // Endpoint para verificar a resposta do jogador
    @PostMapping("/resposta")
    public String verificarResposta(@RequestParam Long perguntaId, @RequestParam int respostaUsuario, @RequestParam int nivel) {
        Pergunta pergunta = perguntaRepository.findById(perguntaId)
                .orElseThrow(() -> new IllegalArgumentException("Pergunta não encontrada"));

        // Verifica se a resposta está correta
        if (pergunta.verificarResposta(respostaUsuario)) {
            // Se a resposta estiver correta, avança para o próximo nível
            return "Resposta correta! Avançando para o próximo nível.";
        } else {
            // Se errar, o jogo termina e o jogador recebe a pontuação final
            return "Resposta errada! O jogo acabou.";
        }
    }
}
