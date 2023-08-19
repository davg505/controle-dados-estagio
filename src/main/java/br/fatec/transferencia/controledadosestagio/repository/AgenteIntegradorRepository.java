package br.fatec.transferencia.controledadosestagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.transferencia.controledadosestagio.model.AgenteIntegrador;


public interface AgenteIntegradorRepository extends JpaRepository<AgenteIntegrador, Long> {
	
      AgenteIntegrador findByNomeAgenteIntegrador(String nomeAgenteIntegrado);

}
