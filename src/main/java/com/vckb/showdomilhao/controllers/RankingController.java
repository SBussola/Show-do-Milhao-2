package com.vckb.showdomilhao.controllers;

import com.vckb.showdomilhao.entities.Ranking;
import com.vckb.showdomilhao.repositories.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ranking")
public class RankingController {

    @Autowired
    private RankingRepository rankingRepository;


    @PostMapping
    public Ranking cadastraRank(@RequestBody Ranking ranking){
        return rankingRepository.save(ranking);
    }

    @GetMapping
    public List<Ranking> getRanking(){
        return rankingRepository.findAllByOrderByScoreDesc();
    }

}