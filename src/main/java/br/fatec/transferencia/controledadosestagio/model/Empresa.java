package br.fatec.transferencia.controledadosestagio.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "cadastro_empresa")
public class Empresa  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String razaoSocial;
	
	private String statusSistema;

	private String cnpj;
	
	private LocalDate dataCadastro;
	
	private String telefone;
	
	private String email;
	
	private String endereco;
	
	private String contato; 
			
	public Empresa(String cnpj) {
		
		this.cnpj = cnpj;
	}
	

}


