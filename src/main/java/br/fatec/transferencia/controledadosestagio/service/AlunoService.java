package br.fatec.transferencia.controledadosestagio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.transferencia.controledadosestagio.model.Aluno;
import br.fatec.transferencia.controledadosestagio.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;

	// Realiza busca e cadastro da empresa no Banco de dados.
	
	public Aluno cadastrar(String ra) {
		Aluno aluno = alunoRepository.findByRa(ra);

		if (aluno == null) {
			aluno = new Aluno(ra);
			aluno = alunoRepository.save(aluno);

		}
		return aluno;

	}

}
