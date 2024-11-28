package com.vckb.showdomilhao.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vckb.showdomilhao.enums.Nivel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pergunta;

    private Nivel nivel;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JsonManagedReference("pergunta-alternativa")
    private List<Alternativa> alternativas;

}
