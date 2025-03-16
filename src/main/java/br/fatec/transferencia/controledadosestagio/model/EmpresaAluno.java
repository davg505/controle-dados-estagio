package br.fatec.transferencia.controledadosestagio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "empresaAluno")
public class EmpresaAluno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;

	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	
	@Column(name = "nome_representante", nullable = false)
	private String  nomeRepresentante;

	@Column(name = "cargo_funcao", nullable = false)
	private String  cargoFuncao;

	@Column(name = "cpf_representante", nullable = false)
	private String  cpfRepresentante;
	


}
