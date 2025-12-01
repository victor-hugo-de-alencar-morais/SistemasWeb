package br.com.projetoescola.escola.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.Repository.UsuarioRepository;
import br.com.projetoescola.escola.entity.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Método para salvar um usuario com senha criptografada
    public Usuario save(Usuario usuario){
        usuario.setSenhaUsuario(passwordEncoder.encode(usuario.getSenhaUsuario()));
        return usuarioRepository.save(usuario);
    }

    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }
}

