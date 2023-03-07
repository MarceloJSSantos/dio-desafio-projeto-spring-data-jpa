package br.com.marcelojssantos.academia.academiadigital.model;

import java.time.LocalDate;
import java.util.List;

public class Aluno {
    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
    private List<AvaliacaoFisica> avaliacoesFisicas;
}
