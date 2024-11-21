package main.model;

import java.time.LocalTime;
import java.util.List;

public class Treino {

    private String nomeTreino;
    private String descricaoTreino;
    private List<String> especialidadeTreino;
    private Professor professor;
    

    public Treino(String nomeTreino, String descricaoTreino, List<String> especialidadeTreino, Professor professor) {
        this.nomeTreino = nomeTreino;
        this.descricaoTreino = descricaoTreino;
        this.especialidadeTreino = especialidadeTreino;
        this.professor = professor;
      
    }

    public Treino() {}

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

  

    

    public String getDados(){
        return "nome" + nomeTreino + "descricao" + descricaoTreino + "especialidade" + especialidadeTreino + "professor" + professor;
    }

}
