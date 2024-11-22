package com.vckb.showdomilhao.repository;



import com.vckb.showdomilhao.entity.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
    List<Pergunta> findByNivelId(int nivel);
    List<Pergunta> findByNivelIdAndIdNotIn(int nivel, List<Long> idsUsados);
}
