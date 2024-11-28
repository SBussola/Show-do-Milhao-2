package com.vckb.showdomilhao.config;

import com.vckb.showdomilhao.entities.Alternativa;
import com.vckb.showdomilhao.entities.Pergunta;
import com.vckb.showdomilhao.enums.Nivel;
import com.vckb.showdomilhao.repositories.PerguntaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SeedData {

    @Bean
    CommandLineRunner initDatabase(PerguntaRepository perguntaRepository) {
        return args -> {


            //FACEIS
            Pergunta p1 = new Pergunta(null,
                    "Qual é a capital do Brasil?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Rio de Janeiro", false, null),
                            new Alternativa(null, "B) Brasília", true, null),
                            new Alternativa(null, "C) São Paulo", false, null),
                            new Alternativa(null, "D) Belo Horizonte", false, null)
                    )
            );

            Pergunta p2 = new Pergunta(null,
                    "Quantos dias tem um ano bissexto?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) 364", false, null),
                            new Alternativa(null, "B) 365", false, null),
                            new Alternativa(null, "C) 366", true, null),
                            new Alternativa(null, "D) 367", false, null)
                    )
            );

            Pergunta p3 = new Pergunta(null,
                    "Quem pintou a Mona Lisa?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Pablo Picasso", false, null),
                            new Alternativa(null, "B) Leonardo da Vinci", true, null),
                            new Alternativa(null, "C) Michelangelo", false, null),
                            new Alternativa(null, "D) Salvador Dalí", false, null)
                    )
            );

            Pergunta p4 = new Pergunta(null,
                    "Qual é o maior planeta do sistema solar?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Terra", false, null),
                            new Alternativa(null, "B) Júpiter", true, null),
                            new Alternativa(null, "C) Marte", false, null),
                            new Alternativa(null, "D) Saturno", false, null)
                    )
            );

            Pergunta p5 = new Pergunta(null,
                    "Qual desses animais é conhecido por sua habilidade de mudar de cor?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Leão", false, null),
                            new Alternativa(null, "B) Camaleão", true, null),
                            new Alternativa(null, "C) Elefante", false, null),
                            new Alternativa(null, "D) Tartaruga", false, null)
                    )
            );

            Pergunta p6 = new Pergunta(null,
                    "Quantos meses têm 28 dias?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) 1", false, null),
                            new Alternativa(null, "B) 2", false, null),
                            new Alternativa(null, "C) 6", false, null),
                            new Alternativa(null, "D) Todos", true, null)
                    )
            );

            Pergunta p7 = new Pergunta(null,
                    "Qual é a soma de 7 + 5?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) 10", false, null),
                            new Alternativa(null, "B) 12", true, null),
                            new Alternativa(null, "C) 14", false, null),
                            new Alternativa(null, "D) 15", false, null)
                    )
            );

            Pergunta p8 = new Pergunta(null,
                    "Em que parte do corpo usamos sapatos?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Cabeça", false, null),
                            new Alternativa(null, "B) Mãos", false, null),
                            new Alternativa(null, "C) Pés", true, null),
                            new Alternativa(null, "D) Braços", false, null)
                    )
            );

            Pergunta p9 = new Pergunta(null,
                    "Qual é a moeda oficial do Brasil?",
                    Nivel.FACIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Dólar", false, null),
                            new Alternativa(null, "B) Euro", false, null),
                            new Alternativa(null, "C) Real", true, null),
                            new Alternativa(null, "D) Peso", false, null)
                    )
            );

            //MODERADAS
            Pergunta p10 = new Pergunta(null,
                    "Qual é a fórmula química da água?",
                    Nivel.MODERADO,
                    Arrays.asList(
                            new Alternativa(null, "A) H2O", true, null),
                            new Alternativa(null, "B) CO2", false, null),
                            new Alternativa(null, "C) O2", false, null),
                            new Alternativa(null, "D) H2SO4", false, null)
                    )
            );

            Pergunta p11 = new Pergunta(null,
                    "Qual é o significado da sigla \"ONU\"?",
                    Nivel.MODERADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Organização Nacional da União", false, null),
                            new Alternativa(null, "B) Organização das Nações Unidas", true, null),
                            new Alternativa(null, "C) Organização Nova Universal", false, null),
                            new Alternativa(null, "D) Organização para o Norte Unido", false, null)
                    )
            );

            Pergunta p12 = new Pergunta(null,
                    "Em que continente fica o Egito?",
                    Nivel.MODERADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Ásia", false, null),
                            new Alternativa(null, "B) África", true, null),
                            new Alternativa(null, "C) Europa", false, null),
                            new Alternativa(null, "D) América do Sul", false, null)
                    )
            );

            Pergunta p13 = new Pergunta(null,
                    "Qual é o número do título que Pelé conquistou na Copa do Mundo?",
                    Nivel.MODERADO,
                    Arrays.asList(
                            new Alternativa(null, "A) 1", false, null),
                            new Alternativa(null, "B) 2", false, null),
                            new Alternativa(null, "C) 3", true, null),
                            new Alternativa(null, "D) 4", false, null)
                    )
            );

            Pergunta p14 = new Pergunta(null,
                    "Em que ano o homem pisou na Lua pela primeira vez?",
                    Nivel.MODERADO,
                    Arrays.asList(
                            new Alternativa(null, "A) 1959", false, null),
                            new Alternativa(null, "B) 1969", true, null),
                            new Alternativa(null, "C) 1979", false, null),
                            new Alternativa(null, "D) 1989", false, null)
                    )
            );

            Pergunta p15 = new Pergunta(null,
                    "Qual é o maior oceano do planeta?",
                    Nivel.MODERADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Atlântico", false, null),
                            new Alternativa(null, "B) Índico", false, null),
                            new Alternativa(null, "C) Ártico", false, null),
                            new Alternativa(null, "D) Pacífico", true, null)
                    )
            );

            Pergunta p16 = new Pergunta(null,
                    "Qual é o idioma oficial da Argentina?",
                    Nivel.MODERADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Inglês", false, null),
                            new Alternativa(null, "B) Francês", false, null),
                            new Alternativa(null, "C) Espanhol", true, null),
                            new Alternativa(null, "D) Italiano", false, null)
                    )
            );

            Pergunta p17 = new Pergunta(null,
                    "Em qual país está localizada a Torre Eiffel?",
                    Nivel.MODERADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Itália", false, null),
                            new Alternativa(null, "B) França", true, null),
                            new Alternativa(null, "C) Espanha", false, null),
                            new Alternativa(null, "D) Alemanha", false, null)
                    )
            );

            //DIFICIL
            Pergunta p18 = new Pergunta(null,
                    "Quem foi o primeiro homem a pisar na Lua?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Buzz Aldrin", false, null),
                            new Alternativa(null, "B) Yuri Gagarin", false, null),
                            new Alternativa(null, "C) Neil Armstrong", true, null),
                            new Alternativa(null, "D) Alan Shepard", false, null)
                    )
            );

            Pergunta p19 = new Pergunta(null,
                    "Qual é o nome do autor de Dom Quixote?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Miguel de Cervantes", true, null),
                            new Alternativa(null, "B) William Shakespeare", false, null),
                            new Alternativa(null, "C) Dante Alighieri", false, null),
                            new Alternativa(null, "D) José de Alencar", false, null)
                    )
            );

            Pergunta p20 = new Pergunta(null,
                    "Qual país é conhecido como \"a terra do sol nascente\"?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) China", false, null),
                            new Alternativa(null, "B) Coreia do Sul", false, null),
                            new Alternativa(null, "C) Japão", true, null),
                            new Alternativa(null, "D) Vietnã", false, null)
                    )
            );

            Pergunta p21 = new Pergunta(null,
                    "Quantos ossos um adulto tem no corpo humano?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) 204", false, null),
                            new Alternativa(null, "B) 206", true, null),
                            new Alternativa(null, "C) 208", false, null),
                            new Alternativa(null, "D) 210", false, null)
                    )
            );

            Pergunta p22 = new Pergunta(null,
                    "Quem foi a primeira mulher a ganhar o Prêmio Nobel?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Marie Curie", true, null),
                            new Alternativa(null, "B) Rosa Parks", false, null),
                            new Alternativa(null, "C) Ada Lovelace", false, null),
                            new Alternativa(null, "D) Jane Austen", false, null)
                    )
            );

            Pergunta p23 = new Pergunta(null,
                    "Qual é a fórmula química do sal de cozinha?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) NaCl", true, null),
                            new Alternativa(null, "B) H2O", false, null),
                            new Alternativa(null, "C) CO2", false, null),
                            new Alternativa(null, "D) KCl", false, null)
                    )
            );

            Pergunta p24 = new Pergunta(null,
                    "Quem é o autor do livro O Senhor dos Anéis?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) C.S. Lewis", false, null),
                            new Alternativa(null, "B) George R.R. Martin", false, null),
                            new Alternativa(null, "C) J.R.R. Tolkien", true, null),
                            new Alternativa(null, "D) J.K. Rowling", false, null)
                    )
            );

            Pergunta p25 = new Pergunta(null,
                    "Qual desses países não faz parte da União Europeia?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Alemanha", false, null),
                            new Alternativa(null, "B) Suíça", true, null),
                            new Alternativa(null, "C) França", false, null),
                            new Alternativa(null, "D) Espanha", false, null)
                    )
            );

            Pergunta p26 = new Pergunta(null,
                    "Qual é o nome da estrela mais próxima da Terra?",
                    Nivel.DIFICIL,
                    Arrays.asList(
                            new Alternativa(null, "A) Alpha Centauri", false, null),
                            new Alternativa(null, "B) Polaris", false, null),
                            new Alternativa(null, "C) Sol", true, null),
                            new Alternativa(null, "D) Sirius", false, null)
                    )
            );

            //DIFICIL
            Pergunta p27 = new Pergunta(null,
                    "Qual é a velocidade da luz no vácuo?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) 299.792 km/s", false, null),
                            new Alternativa(null, "B) 300.000 km/s", false, null),
                            new Alternativa(null, "C) 299.792.458 m/s", true, null),
                            new Alternativa(null, "D) 300.000.000 m/s", false, null)
                    )
            );

            Pergunta p28 = new Pergunta(null,
                    "Qual foi o último imperador romano?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Constantino", false, null),
                            new Alternativa(null, "B) Augusto", false, null),
                            new Alternativa(null, "C) Nero", false, null),
                            new Alternativa(null, "D) Rômulo Augusto", true, null)
                    )
            );

            Pergunta p29 = new Pergunta(null,
                    "Quem escreveu A Origem das Espécies?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Isaac Newton", false, null),
                            new Alternativa(null, "B) Charles Darwin", true, null),
                            new Alternativa(null, "C) Galileo Galilei", false, null),
                            new Alternativa(null, "D) Alfred Wallace", false, null)
                    )
            );

            Pergunta p30 = new Pergunta(null,
                    "Qual é o elemento químico com símbolo \"Au\"?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Prata", false, null),
                            new Alternativa(null, "B) Ouro", true, null),
                            new Alternativa(null, "C) Alumínio", false, null),
                            new Alternativa(null, "D) Mercúrio", false, null)
                    )
            );

            Pergunta p31 = new Pergunta(null,
                    "Qual é o maior deserto do mundo?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Saara", false, null),
                            new Alternativa(null, "B) Gobi", false, null),
                            new Alternativa(null, "C) Kalahari", false, null),
                            new Alternativa(null, "D) Antártico", true, null)
                    )
            );

            Pergunta p32 = new Pergunta(null,
                    "Qual é a maior montanha do mundo, em altura?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) K2", false, null),
                            new Alternativa(null, "B) Everest", true, null),
                            new Alternativa(null, "C) Kangchenjunga", false, null),
                            new Alternativa(null, "D) Makalu", false, null)
                    )
            );

            Pergunta p33 = new Pergunta(null,
                    "Qual foi o primeiro satélite artificial lançado ao espaço?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Explorer 1", false, null),
                            new Alternativa(null, "B) Sputnik 1", true, null),
                            new Alternativa(null, "C) Voyager 1", false, null),
                            new Alternativa(null, "D) Apollo 11", false, null)
                    )
            );

            Pergunta p34 = new Pergunta(null,
                    "Em que ano ocorreu a Revolução Francesa?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) 1789", true, null),
                            new Alternativa(null, "B) 1799", false, null),
                            new Alternativa(null, "C) 1804", false, null),
                            new Alternativa(null, "D) 1815", false, null)
                    )
            );

            Pergunta p35 = new Pergunta(null,
                    "Qual é a partitura de abertura de A Flauta Mágica, de Mozart?",
                    Nivel.AVANCADO,
                    Arrays.asList(
                            new Alternativa(null, "A) Réquiem", false, null),
                            new Alternativa(null, "B) Eine Kleine Nachtmusik", false, null),
                            new Alternativa(null, "C) Overture", true, null),
                            new Alternativa(null, "D) Allegro", false, null)
                    )
            );

            List<Pergunta> perguntas = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
                    p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28,
                    p29, p30, p31, p32, p33, p34, p35));


            perguntaRepository.saveAll(perguntas);
            System.out.println("Perguntas salvas com sucesso!");

        };
    }
}