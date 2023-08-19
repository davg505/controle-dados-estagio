package br.fatec.transferencia.controledadosestagio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "equivalencias")
public class Equivalencias implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String  documentacaoDaEmpresa;
	
	private String documentacaoDaEquivalencia;
	
	private String observacao;
	
	@OneToOne
	@JoinColumn(name = "id_estagios")
	private Estagios estagios;
	
	@OneToOne
	@JoinColumn(name = "id_cadastro_empresa")
	private Empresa empresa;

}
