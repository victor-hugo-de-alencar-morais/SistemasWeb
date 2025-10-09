package br.com.projetoescola.escola.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoescola.escola.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}