package br.com.projetoescola.escola.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoescola.escola.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
   
}
