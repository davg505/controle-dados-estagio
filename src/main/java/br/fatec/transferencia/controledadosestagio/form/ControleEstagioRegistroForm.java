package br.fatec.transferencia.controledadosestagio.form;

import java.time.LocalDate;

import javax.validation.Valid;

import br.fatec.transferencia.controledadosestagio.model.AgenteIntegrador;
import br.fatec.transferencia.controledadosestagio.model.Aluno;
import br.fatec.transferencia.controledadosestagio.model.Empresa;
import br.fatec.transferencia.controledadosestagio.model.Estagios;
import br.fatec.transferencia.controledadosestagio.model.TipoDocumento;
import br.fatec.transferencia.controledadosestagio.service.AgenteIntegradorService;
import br.fatec.transferencia.controledadosestagio.service.AlunoService;
import br.fatec.transferencia.controledadosestagio.service.ControleEstagioService;
import br.fatec.transferencia.controledadosestagio.service.EmpresaService;
import br.fatec.transferencia.controledadosestagio.service.TipoDocumentoService;
import lombok.Data;

@Data
@Valid
public class ControleEstagioRegistroForm {

	private String alunos;
	
	private String semestre;
	
	private String ra;
	
	private String anoDoEstagio;
	
	private LocalDate dataInicial;
	
	private LocalDate dataFinal;
		
	private LocalDate dataCadastro;
	
	private String nomeAgenteIntegrado;
	
	private String cnpj;
	
	private String obrigatorio;
	
	private String nomeDocumento;

	
	public Estagios converter (ControleEstagioService controleEstagioService, EmpresaService empresaService, TipoDocumentoService tipoDocumentoService,	
			AlunoService alunoService, AgenteIntegradorService agenteIntegradorService  ) {
		
		
		
		 // Para Cadastro nome da empresa .
		Empresa empresa = empresaService.cadastrar(cnpj);
		
		 // Para Cadastro tipo de documento .
		TipoDocumento tipoDocumento = tipoDocumentoService.cadastrar(nomeDocumento);
		
		 // Para Cadastro tipo de aluno .
		Aluno aluno = alunoService.cadastrar(ra);
		
		// Para Cadastro tipo de agenteIntegrador .
		AgenteIntegrador agenteIntegrador = agenteIntegradorService.cadastrar(nomeAgenteIntegrado);
		
		return new Estagios(anoDoEstagio,dataCadastro,
				dataInicial, dataFinal, obrigatorio, tipoDocumento, aluno, empresa,
				agenteIntegrador);
	
	
	
	
	}
	
}
