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
import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "estagio")
public class Estagio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;

	private String status;

	@Column(name = "tipo_de_estagio", nullable = false, length = 100)
    private String tipoDeEstagio;

    @Column(name = "modelo", nullable = false, length = 100)
    private String modelo;

    @Column(name = "solicitacao", nullable = false, length = 100)
    private String solicitacao;

    @Column(name = "data_solicitacao", nullable = false)
    private LocalDate dataSolicitacao;

    @Column(name = "status_do_termo", nullable = false, length = 50)
    private String statusDoTermo;

    @Column(name = "prorrogacao_periodo", nullable = false, length = 50)
    private String prorrogacaoPeriodo;

    @Column(name = "transicao_do_obrigatorio", nullable = false, length = 50)
    private String transicaoDoObrigatorio;

    @Column(name = "rescisao_termo", nullable = false, length = 50)
    private String rescisaoTermo;

    @Column(name = "relatorio_estagio", nullable = false, length = 50)
    private String relatorioEstagio;

    @Column(name = "ficha_avaliacao", nullable = false, length = 50)
    private String fichaAvaliacao;



	
	
}
