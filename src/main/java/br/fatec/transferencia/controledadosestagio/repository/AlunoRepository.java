package br.fatec.transferencia.controledadosestagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.transferencia.controledadosestagio.model.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	public Aluno findByRa(String ra);
	

}
