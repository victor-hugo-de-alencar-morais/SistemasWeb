package br.com.projetoescola.escola.security;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.Repository.UsuarioRepository;
import br.com.projetoescola.escola.entity.Usuario;
 
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
   
    @Autowired
    private UsuarioRepository usuarioRepository;
 
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByLoginUsuario(login)
            .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + login));
        return new UserDetailsImpl(usuario);
    }
 
}
 
