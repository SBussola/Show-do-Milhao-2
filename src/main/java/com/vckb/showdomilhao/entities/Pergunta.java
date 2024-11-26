package com.vckb.showdomilhao.entities;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @ManyToOne
    @JoinColumn(name = "nivel_id")
    @JsonBackReference("nivel-pergunta")
    private Nivel nivel;

    @OneToMany
    @JsonManagedReference("pergunta-alternativa")
    private List<Alternativa> alternativas;

}
