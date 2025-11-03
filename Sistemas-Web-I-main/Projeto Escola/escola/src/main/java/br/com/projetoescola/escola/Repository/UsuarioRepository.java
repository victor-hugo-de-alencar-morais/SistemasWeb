package br.com.projetoescola.escola.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoescola.escola.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
