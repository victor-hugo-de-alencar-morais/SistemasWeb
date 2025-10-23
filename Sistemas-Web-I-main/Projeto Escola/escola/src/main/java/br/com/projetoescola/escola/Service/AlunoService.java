package br.com.projetoescola.escola.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.Repository.AlunoRepository;
import br.com.projetoescola.escola.dto.AlunoTelefone;
import br.com.projetoescola.escola.entity.Aluno;

@Service
public class AlunoService {
 
    // Injeção de dependência do repositório de alunos
    @Autowired
    private AlunoRepository alunoRepository;
 
    //Método para salvar um aluno
    public Aluno save(Aluno aluno){
        return alunoRepository.save(aluno);
    }
 
    //Método para listar todos os alunos
    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    //metodo para excluir um aluno pelo ID
    public void deleteById(Integer id){
        alunoRepository.deleteById(id);
    }

    //metodo para buscar o aluno pelo ID
    public Aluno findById(Integer id){
        return alunoRepository.findById(id).orElse(null);
    }
 
    public List<AlunoTelefone> buscarNomeTelefone(){
        return alunoRepository.buscarNomeTelefone();
    }
   
}

