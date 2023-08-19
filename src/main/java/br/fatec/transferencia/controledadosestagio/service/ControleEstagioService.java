package br.fatec.transferencia.controledadosestagio.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.transferencia.controledadosestagio.model.Aluno;
import br.fatec.transferencia.controledadosestagio.model.Estagios;
import br.fatec.transferencia.controledadosestagio.repository.EstagiosRepository;



@Service
public class ControleEstagioService {
	
	
	@Autowired
	EstagiosRepository estagioRepository;
	
	
	
	//Faz a busca pelo ra 
	
	public Estagios buscarPorRa (Aluno aluno) {
		
		return estagioRepository.findByAluno(aluno);
		
		
	}
	
	
	///Cadastro para o banco de dados da lista dados
	
	public void cadastrar(Estagios listaDadosEstagios) {
		
			if (buscarPorRa(listaDadosEstagios.getAluno()) == null) {
			
				estagioRepository.save(listaDadosEstagios);
				
		} else {
			
			atualizar(listaDadosEstagios);		
	} 
			
		
		
	}
	
	//Faz alteração em mudança dos dados feito pelo Estagios
	public void atualizar (Estagios estagiosAcadastrar) {
		
		Estagios dadosEncontrados = buscarPorRa(estagiosAcadastrar.getAluno());
		
		if(dadosEncontrados != null) {
			
			
			
			estagioRepository.save(dadosEncontrados);
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
