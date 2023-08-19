package br.fatec.transferencia.controledadosestagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fatec.transferencia.controledadosestagio.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	public Empresa findByCnpj(String cnpj);

}
