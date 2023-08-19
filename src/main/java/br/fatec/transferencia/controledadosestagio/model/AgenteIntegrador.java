package br.fatec.transferencia.controledadosestagio.model;

import java.io.Serializable;


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
@Table(name= "agente_integrador")
public class AgenteIntegrador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nomeAgenteIntegrador;

	public AgenteIntegrador(String nomeAgenteIntegrador) {
		this.nomeAgenteIntegrador = nomeAgenteIntegrador;
	}
	
	

}
