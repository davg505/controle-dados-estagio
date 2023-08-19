package br.fatec.transferencia.controledadosestagio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.fatec.transferencia.controledadosestagio.model.Empresa;
import br.fatec.transferencia.controledadosestagio.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;

	// Realiza busca e cadastro da empresa no Banco de dados.
	
	public Empresa cadastrar(String cnpj) {
		Empresa empresa = empresaRepository.findByCnpj(cnpj);

		if (empresa == null) {
			empresa = new Empresa(cnpj);
			empresa = empresaRepository.save(empresa);

		}
		return empresa;

	}
}
