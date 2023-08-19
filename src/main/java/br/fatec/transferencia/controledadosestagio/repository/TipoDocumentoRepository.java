package br.fatec.transferencia.controledadosestagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.transferencia.controledadosestagio.model.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {

	public TipoDocumento findByNomeDocumento (String nomeDocumento);
}
