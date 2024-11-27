package com.vckb.showdomilhao.config;

import com.vckb.showdomilhao.entities.Nivel;
import com.vckb.showdomilhao.entities.Pergunta;
import com.vckb.showdomilhao.repositories.NivelRepository;
import com.vckb.showdomilhao.repositories.PerguntaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class SeedData {

    @Bean
    CommandLineRunner initDatabase(PerguntaRepository perguntaRepository, NivelRepository nivelRepository) {
        return args -> {
            // Criar Níveis de Dificuldade
            Nivel nivel1 = new Nivel(1, "Fácil", 1000);
            Nivel nivel2 = new Nivel(2, "Moderado", 10000);
            Nivel nivel3 = new Nivel(3, "Difícil", 100000);
            Nivel nivel4 = new Nivel(4, "Avançado", 1000000);

            // Salvar Níveis
            nivelRepository.saveAll(Arrays.asList(nivel1, nivel2, nivel3, nivel4));
            System.out.println("Níveis de dificuldade salvos com sucesso!");

            // Criar Perguntas
            List<Pergunta> perguntas = Arrays.asList(
                // Nível 1 - Fáceis
                new Pergunta(null, "Qual é a capital do Brasil?", nivel1, Arrays.asList("Rio de Janeiro", "Brasília", "São Paulo", "Salvador"), 2),
                new Pergunta(null, "Quantos dias tem um ano bissexto?", nivel1, Arrays.asList("364", "365", "366", "367"), 3),
                new Pergunta(null, "Quem pintou a Mona Lisa?", nivel1, Arrays.asList("Pablo Picasso", "Leonardo da Vinci", "Michelangelo", "Salvador Dalí"), 2),
                new Pergunta(null, "Qual é o maior planeta do sistema solar?", nivel1, Arrays.asList("Terra", "Júpiter", "Marte", "Saturno"), 2),
                new Pergunta(null, "Qual desses animais é conhecido por sua habilidade de mudar de cor?", nivel1, Arrays.asList("Leão", "Camaleão", "Elefante", "Tartaruga"), 2),
                new Pergunta(null, "Quantos meses têm 28 dias?", nivel1, Arrays.asList("1", "2", "6", "Todos"), 4),
                new Pergunta(null, "Qual é a soma de 7 + 5?", nivel1, Arrays.asList("10", "12", "14", "15"), 2),
                new Pergunta(null, "Em que parte do corpo usamos sapatos?", nivel1, Arrays.asList("Cabeça", "Mãos", "Pés", "Braços"), 3),
                new Pergunta(null, "Qual é a moeda oficial do Brasil?", nivel1, Arrays.asList("Dólar", "Euro", "Real", "Peso"), 3),

                // Nível 2 - Moderadas
                new Pergunta(null, "Qual é a fórmula química da água?", nivel2, Arrays.asList("H2O", "CO2", "O2", "H2SO4"), 1),
                new Pergunta(null, "Qual é o significado da sigla 'ONU'?", nivel2, Arrays.asList("Organização Nacional da União", "Organização das Nações Unidas", "Organização Nova Universal", "Organização para o Norte Unido"), 2),
                new Pergunta(null, "Em que continente fica o Egito?", nivel2, Arrays.asList("Ásia", "África", "Europa", "América do Sul"), 2),
                new Pergunta(null, "Qual é o número do título que Pelé conquistou na Copa do Mundo?", nivel2, Arrays.asList("1", "2", "3", "4"), 3),
                new Pergunta(null, "Em que ano o homem pisou na Lua pela primeira vez?", nivel2, Arrays.asList("1959", "1969", "1979", "1989"), 2),

                // Nível 3 - Difícil
                new Pergunta(null, "Quem foi o primeiro homem a pisar na Lua?", nivel3, Arrays.asList("Buzz Aldrin", "Yuri Gagarin", "Neil Armstrong", "Alan Shepard"), 3),
                new Pergunta(null, "Qual é o nome do autor de Dom Quixote?", nivel3, Arrays.asList("Miguel de Cervantes", "William Shakespeare", "Dante Alighieri", "José de Alencar"), 1),
                new Pergunta(null, "Qual país é conhecido como 'a terra do sol nascente'?", nivel3, Arrays.asList("China", "Coreia do Sul", "Japão", "Vietnã"), 3),
                new Pergunta(null, "Quantos ossos um adulto tem no corpo humano?", nivel3, Arrays.asList("204", "206", "208", "210"), 2),
                new Pergunta(null, "Quem foi a primeira mulher a ganhar o Prêmio Nobel?", nivel3, Arrays.asList("Marie Curie", "Rosa Parks", "Ada Lovelace", "Jane Austen"), 1),
                new Pergunta(null, "Qual é a fórmula química do sal de cozinha?", nivel3, Arrays.asList("NaCl", "H2O", "CO2", "KCl"), 1),
                new Pergunta(null, "Quem é o autor do livro O Senhor dos Anéis?", nivel3, Arrays.asList("C.S. Lewis", "George R.R. Martin", "J.R.R. Tolkien", "J.K. Rowling"), 3),
                new Pergunta(null, "Qual desses países não faz parte da União Europeia?", nivel3, Arrays.asList("Alemanha", "Suíça", "França", "Espanha"), 2),

                // Nível 4 - Avançado
                new Pergunta(null, "Qual é a velocidade da luz no vácuo?", nivel4, Arrays.asList("299.792 km/s", "300.000 km/s", "299.792.458 m/s", "300.000.000 m/s"), 3),
                new Pergunta(null, "Qual foi o último imperador romano?", nivel4, Arrays.asList("Constantino", "Augusto", "Nero", "Rômulo Augusto"), 4),
                new Pergunta(null, "Quem escreveu A Origem das Espécies?", nivel4, Arrays.asList("Isaac Newton", "Charles Darwin", "Galileo Galilei", "Alfred Wallace"), 2),
                new Pergunta(null, "Qual é o elemento químico com símbolo 'Au'?", nivel4, Arrays.asList("Prata", "Ouro", "Alumínio", "Mercúrio"), 2)
            );

            // Embaralhar perguntas para evitar padrão fixo
            Collections.shuffle(perguntas);

            // Salvar Perguntas no banco de dados
            perguntaRepository.saveAll(perguntas);
            System.out.println("Perguntas salvas com sucesso!");
        };
    }
}
