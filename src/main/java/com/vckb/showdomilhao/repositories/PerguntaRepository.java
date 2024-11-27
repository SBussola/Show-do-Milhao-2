package com.vckb.showdomilhao.repositories;



import com.vckb.showdomilhao.entities.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
    List<Pergunta> findByNivelId(int nivel);
    List<Pergunta> findByNivelIdAndIdNotIn(int nivel, List<Long> idsUsados);
}
