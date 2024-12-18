package com.vckb.showdomilhao.repositories;



import com.vckb.showdomilhao.entities.Pergunta;
import com.vckb.showdomilhao.enums.Nivel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
    List<Pergunta> findByNivel(Nivel nivel);

}
