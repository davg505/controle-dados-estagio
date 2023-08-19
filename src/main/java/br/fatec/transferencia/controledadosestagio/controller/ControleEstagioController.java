package br.fatec.transferencia.controledadosestagio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatec.transferencia.controledadosestagio.form.ControleEstagioRegistroForm;
import br.fatec.transferencia.controledadosestagio.model.Estagios;
import br.fatec.transferencia.controledadosestagio.service.AgenteIntegradorService;
import br.fatec.transferencia.controledadosestagio.service.AlunoService;
import br.fatec.transferencia.controledadosestagio.service.ControleEstagioService;
import br.fatec.transferencia.controledadosestagio.service.EmpresaService;
import br.fatec.transferencia.controledadosestagio.service.TipoDocumentoService;


@RestController
@RequestMapping(value = "/controle")
@Validated
public class ControleEstagioController {
	
	@Autowired
	ControleEstagioService controleEstagioService;
	
	@Autowired
	EmpresaService empresaService; 
	
	@Autowired
	TipoDocumentoService tipoDocumentoService;
	
	@Autowired
	AlunoService alunoService;
	
	@Autowired
	AgenteIntegradorService agenteIntegradorService;
	
	@PostMapping
	public ResponseEntity<?> cadastrar(@Valid @RequestBody ControleEstagioRegistroForm form){
		
		
		if (form.getRa() != null) {
			
			Estagios estagios = form.converter(controleEstagioService, empresaService, tipoDocumentoService, alunoService, agenteIntegradorService );
			
			controleEstagioService.cadastrar(estagios);
			System.out.println("Inserido no banco de dados");
			
		}
		
		return ResponseEntity.ok().build();
		
		
	}	

	

}
