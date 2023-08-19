package br.fatec.transferencia.controledadosestagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.transferencia.controledadosestagio.model.Aluno;
import br.fatec.transferencia.controledadosestagio.model.Estagios;


public interface EstagiosRepository extends JpaRepository<Estagios, Long>{

	Estagios findByAluno(Aluno aluno);

}
