package br.com.projetoescola.escola.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.Repository.UsuarioRepository;
import br.com.projetoescola.escola.entity.Usuario;

@Service
public class UsuarioService {

    // Injeção de dependência do repositório de usuarios
    @Autowired
    private UsuarioRepository usuarioRepository;
 
    //Método para salvar um usuario
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //metodo para buscar o usuario pelo ID
    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }
    
}
