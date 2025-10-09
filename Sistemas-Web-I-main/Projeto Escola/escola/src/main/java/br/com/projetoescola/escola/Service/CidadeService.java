
package br.com.projetoescola.escola.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.Repository.CidadeRepository;
import br.com.projetoescola.escola.entity.Cidade;

@Service
public class CidadeService {
 
    // Injeção de dependência do repositório de alunos
    @Autowired
    private CidadeRepository cidadeRepository;
 
    //Método para salvar um aluno
    public Cidade save(Cidade cidade){
        return cidadeRepository.save(cidade);
    }
 
    //Método para listar todos os alunos
    public List<Cidade> findAll(){
        return cidadeRepository.findAll();
    }

     //metodo para excluir um curso pelo ID
     public void deleteById(Integer id){
        cidadeRepository.deleteById(id);
    }

    //metodo para buscar o curso pelo ID
    public Cidade findById(Integer id){
        return cidadeRepository.findById(id).orElse(null);
    }
 
   
}