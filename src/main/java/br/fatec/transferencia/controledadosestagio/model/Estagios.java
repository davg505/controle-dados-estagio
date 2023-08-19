package br.fatec.transferencia.controledadosestagio.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "estagios")
public class Estagios implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEstagios;
	
	private LocalDate dataFinal;
	
	private String anoDoEstagio;
	
	private LocalDate dataCadastro;
	
	private LocalDate dataInicial;
	
	private String obrigatorio;
	
	@ManyToOne
	@JoinColumn(name = "id_tipoDocumento")
	private TipoDocumento tipoDocumento;
	
	@ManyToOne
	@JoinColumn(name = "id_aluno")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "id_cadastro_empresa")
	private Empresa empresa;

	@ManyToOne
	@JoinColumn(name = "id_agente_integrador")
	private AgenteIntegrador agenteIntegrador;

	public Estagios(String anoDoEstagio, LocalDate dataCadastro,
			LocalDate dataInicial,  LocalDate dataFinal, String obrigatorio, TipoDocumento tipoDocumento, Aluno aluno, Empresa empresa,
			AgenteIntegrador agenteIntegrador) {

		this.anoDoEstagio = anoDoEstagio;
		this.dataCadastro = dataCadastro;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.obrigatorio = obrigatorio;
		this.tipoDocumento = tipoDocumento;
		this.aluno = aluno;
		this.empresa = empresa;
		this.agenteIntegrador = agenteIntegrador;
	}


	
	
}
