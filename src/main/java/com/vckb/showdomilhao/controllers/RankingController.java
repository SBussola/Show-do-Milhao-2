package com.vckb.showdomilhao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vckb.showdomilhao.entities.Ranking;
import com.vckb.showdomilhao.repositories.RankingRepository;

@RestController
@RequestMapping("/ranking")
@CrossOrigin("*")
public class RankingController {

    @Autowired
    private RankingRepository rankingRepository;

    @PostMapping
    public Ranking cadastraRank(@RequestBody Ranking ranking) {
        return rankingRepository.save(ranking);
    }

    @GetMapping
    public List<Ranking> getRanking() {
        return rankingRepository.findAllByOrderByScoreDesc();
    }

}
