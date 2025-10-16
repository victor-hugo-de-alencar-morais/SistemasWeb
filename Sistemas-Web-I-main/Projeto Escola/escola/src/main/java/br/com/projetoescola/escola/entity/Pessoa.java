package br.com.projetoescola.escola.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPessoa; 

    @Column(nullable = false, length = 40)
    private String nomePessoa;

    public Pessoa() {
    }

    public Pessoa(Integer idPessoa, String nomePessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
    }

    
    
}
