package com.vckb.showdomilhao.repositories;

import com.vckb.showdomilhao.entities.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RankingRepository extends JpaRepository<Ranking, Long> {
    List<Ranking> findAllByOrderByScoreDesc();
}
