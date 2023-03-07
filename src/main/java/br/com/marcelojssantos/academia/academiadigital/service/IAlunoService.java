package br.com.marcelojssantos.academia.academiadigital.service;

import br.com.marcelojssantos.academia.academiadigital.model.Aluno;
import br.com.marcelojssantos.academia.academiadigital.model.AvaliacaoFisica;
import br.com.marcelojssantos.academia.academiadigital.model.dto.AlunoDTO;
import br.com.marcelojssantos.academia.academiadigital.model.dto.AlunoUpdateDTO;

import java.util.List;

public interface IAlunoService {
    /**
     * Cria um Aluno e salva no banco de dados.
     * @param alunoDto formulário referente aos dados para criação de um Aluno no banco de dados.
     * @return Aluno recém-criado.
     */
    Aluno create(AlunoDTO alunoDto);

    /**
     * Retorna um Aluno que está no banco de dados de acordo com seu Id.
     * @param id id do Aluno que será exibido.
     * @return Aluno de acordo com o Id fornecido.
     */
    Aluno get(Long id);

    /**
     * Retorna os Alunos que estão no banco
     * @return Uma lista os Alunos que estão salvas no DB.
     */
    List<Aluno> getAll();

    /**
     * Atualiza o Aluno.
     * @param id id do Aluno que será atualizado.
     * @param alunoUpdateDTO formulário referente aos dados necessários para atualização do Aluno
     * no banco de dados.
     * @return Aluno recém-atualizado.
     */
    Aluno update(Long id, AlunoUpdateDTO alunoUpdateDTO);

    /**
     * Deleta um Aluno específico.
     * @param id id do Aluno que será removido.
     */
    void delete(Long id);

    /**
     *
     * @param id id do aluno que será recuperada a lista de avaliações
     * @return uma lista com todas as avaliações do aluno de acordo com o Id
     */
    List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id);

}
