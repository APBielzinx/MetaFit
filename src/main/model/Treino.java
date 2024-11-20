package main.model;

import java.time.LocalTime;
import java.util.List;

public class Treino {

    private String nomeTreino;
    private String descricaoTreino;
    private List<String> especialidadeTreino;
    private Professor professor;
    private LocalTime duracaoTreino;

    public Treino(String nomeTreino, String descricaoTreino, List<String> especialidadeTreino, Professor professor, LocalTime duracaoTreino) {
        this.nomeTreino = nomeTreino;
        this.descricaoTreino = descricaoTreino;
        this.especialidadeTreino = especialidadeTreino;
        this.professor = professor;
        this.duracaoTreino = duracaoTreino;
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

    public LocalTime getDuracaoTreino() {
        return duracaoTreino;
    }

    public void setDuracaoTreino(LocalTime duracaoTreino) {
        this.duracaoTreino = duracaoTreino;
    }

    public String getDados(){
        return "nome" + nomeTreino + "descricao" + descricaoTreino + "especialidade" + especialidadeTreino + "professor" + professor + "duracao" + duracaoTreino;
    }

}
