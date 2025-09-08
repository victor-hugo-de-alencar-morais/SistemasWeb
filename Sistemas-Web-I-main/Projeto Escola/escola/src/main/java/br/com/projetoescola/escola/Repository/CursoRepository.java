package br.com.projetoescola.escola.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoescola.escola.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}