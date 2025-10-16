package br.com.projetoescola.escola.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Aluno extends Pessoa {


    @Column (nullable = false, length = 11)
    private String telefoneAluno;

    @Column (nullable = false, length = 40)
    private String enderecoAluno;

    @Column (nullable = false, length = 11)
    private String rmAluno;

    @Column (nullable = false, length = 40)
    private String cpfAluno;

    @ManyToOne
    @JoinColumn(name ="idCurso_fk")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name ="idCidade_fk")
    private Cidade cidade;
    
}
