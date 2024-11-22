package com.vckb.showdomilhao.controllers;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PerguntasController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    
}
