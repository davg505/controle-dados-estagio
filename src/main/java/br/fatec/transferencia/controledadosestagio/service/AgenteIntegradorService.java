package br.fatec.transferencia.controledadosestagio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.transferencia.controledadosestagio.model.AgenteIntegrador;
import br.fatec.transferencia.controledadosestagio.repository.AgenteIntegradorRepository;

@Service
public class AgenteIntegradorService {
	
	@Autowired
	private AgenteIntegradorRepository agenteIntegradorRepository;

	// Realiza busca e cadastro da AgenteIntegrado no Banco de dados.
	
	public AgenteIntegrador cadastrar(String nomeAgenteIntegrado) {
		AgenteIntegrador agenteIntegrador = agenteIntegradorRepository.findByNomeAgenteIntegrador(nomeAgenteIntegrado);

		if (agenteIntegrador == null) {
			agenteIntegrador = new AgenteIntegrador(nomeAgenteIntegrado);
			agenteIntegrador = agenteIntegradorRepository.save(agenteIntegrador);

		}
		return agenteIntegrador;

	}

}
