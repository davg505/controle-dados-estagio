package br.fatec.transferencia.controledadosestagio.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.fatec.transferencia.controledadosestagio.model.Aluno;
import lombok.Data;


@Data
public class AlunoListModel {

    private String nomeDoAluno;
    private String email;
    private String ra;
    private String curso;
    private String status;
    private String modalidade;
    private String telefone;

  
    
    
    }
    
