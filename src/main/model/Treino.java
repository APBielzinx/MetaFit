package main.model;


import java.util.List;

public class Treino {

    private String idTreino;
    private String nomeTreino;
    private String descricaoTreino;
    private List<String> especialidadeTreino;
    private Professor professor;
    private String instucoes;


    public Treino(String idTreino, String nomeTreino, String descricaoTreino, List<String> especialidadeTreino, Professor professor, String instucoes) {
       this.idTreino = idTreino;
        this.nomeTreino = nomeTreino;
        this.descricaoTreino = descricaoTreino;
        this.especialidadeTreino = especialidadeTreino;
        this.professor = professor;
        this.instucoes = instucoes;
    }

    public Treino() {}

    public String getId() {
        return idTreino;
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public String getDescricaoTreino() {
        return descricaoTreino;
    }

    public void setDescricaoTreino(String descricaoTreino) {
        this.descricaoTreino = descricaoTreino;
    }

    public List<String> getEspecialidadeTreino() {
        return especialidadeTreino;
    }

    public void setEspecialidadeTreino(List<String> especialidadeTreino) {
        this.especialidadeTreino = especialidadeTreino;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getInstucoes() {
        return instucoes;
    }

    public void setInstucoes(String instucoes) {
        this.instucoes = instucoes;
    }

    public String getDados(){
        return "Id:"+idTreino+"nome" + nomeTreino + "descricao" + descricaoTreino + "especialidade" + especialidadeTreino + "professor" + professor + "instrucoes" + instucoes;
    }

}
