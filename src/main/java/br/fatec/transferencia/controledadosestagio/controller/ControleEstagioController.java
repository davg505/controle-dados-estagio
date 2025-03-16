package br.fatec.transferencia.controledadosestagio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatec.transferencia.controledadosestagio.service.AlunoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import br.fatec.transferencia.controledadosestagio.mo



@RestController
@RequestMapping(value = "/controle")
@Validated
public class ControleEstagioController {
	
	@Autowired
	AlunoService alunoService;
	
	
	@GetMapping("/alunos")
    public ResponseEntity<List<AlunoListModel>> getListaAlunos() {
        List<Aluno> alunos = alunoService.listarAlunos(); // Método no service para buscar os alunos
        List<AlunoListModel> alunosDto = alunos.stream()
                .map(AlunoListModel::new) // Converte Aluno para AlunoListModel
                .collect(Collectors.toList());

        return ResponseEntity.ok(alunosDto);
    }
	
}