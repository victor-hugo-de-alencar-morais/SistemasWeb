package br.com.projetoescola.escola.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cidade {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer idCidade;

    @Column (nullable = false, length = 30)
    private String nomeCidade;

    // Consultor vazio
    public Cidade() {
    }

    // Consultor cheio
    public Cidade(Integer idCidade, String nomeCidade) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
    }

    // Setters and Getters
    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}

