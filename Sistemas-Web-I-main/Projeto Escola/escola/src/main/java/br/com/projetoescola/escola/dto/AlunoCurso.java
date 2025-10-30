package br.com.projetoescola.escola.dto;

public class AlunoCurso {
    private String nomeAluno;
    private String cursoAluno;
    public AlunoCurso() {
    }
   
    public AlunoCurso(String nomeAluno, String cursoAluno) {
        this.nomeAluno = nomeAluno;
        this.cursoAluno = cursoAluno;
    }
 
    public String getNomeAluno() {
        return nomeAluno;
    }
    public String getCursoAluno() {
        return cursoAluno;
    }
   
}
