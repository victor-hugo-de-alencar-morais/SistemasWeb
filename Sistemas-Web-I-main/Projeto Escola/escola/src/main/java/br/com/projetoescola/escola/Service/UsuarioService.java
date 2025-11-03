package br.com.projetoescola.escola.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.Repository.UsuarioRepository;
import br.com.projetoescola.escola.entity.Usuario;

@Service
public class UsuarioService {

    // Injeção de dependência do repositório de alunos
    @Autowired
    private UsuarioRepository usuarioRepository;
 
    //Método para salvar um aluno
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //metodo para buscar o aluno pelo ID
    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }
    
}
