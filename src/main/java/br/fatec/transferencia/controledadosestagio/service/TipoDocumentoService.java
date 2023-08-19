package br.fatec.transferencia.controledadosestagio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.transferencia.controledadosestagio.model.TipoDocumento;
import br.fatec.transferencia.controledadosestagio.repository.TipoDocumentoRepository;


@Service
public class TipoDocumentoService {
	
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;
	
	// Realiza busca e cadastro da empresa no Banco de dados.
	
	public TipoDocumento cadastrar(String nomeDocumento) {
		TipoDocumento tipoDocumento = tipoDocumentoRepository.findByNomeDocumento(nomeDocumento);

		if (tipoDocumento == null) {
			tipoDocumento = new TipoDocumento(nomeDocumento);
			tipoDocumento = tipoDocumentoRepository.save(tipoDocumento);

		}
		return tipoDocumento;

	}

}
