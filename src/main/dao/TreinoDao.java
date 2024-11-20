package main.dao;

import main.controller.Validador;
import main.model.Professor;
import main.model.Treino;

import javax.swing.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TreinoDao {


    Validador validador = new Validador();
    ArrayList<Treino> treinos = new ArrayList<>();

    public Treino criar(String nomeTreino, String descricaoTreino, List<String> especialidadeTreino, Professor professor, LocalTime duracaoTreino) {

        Treino treino = new Treino( nomeTreino, descricaoTreino,  especialidadeTreino,  professor,  duracaoTreino);

        if (!validador.validarTreino(treino)){
            //continua na mesma tela e usuario altera as informações erradas
            return null;
        }
        treinos.add(treino);
        JOptionPane.showMessageDialog(null, "Treino criado com sucesso! "+treino.getDados(),"Treino", JOptionPane.INFORMATION_MESSAGE);
        return treino;
    }

    public List<Treino> getTreinoByEspecialidade(String especialidade) {
        List<Treino> treinosFiltrados = new ArrayList<>();
        for (Treino treino : treinos) {
            if (treino.getEspecialidadeTreino().contains(especialidade)) {
                treinosFiltrados.add(treino);
            }
        }

        return treinosFiltrados;
    }

    public List<Treino> getTreinoByProfessor(String professor) {
        List<Treino> treinosFiltrados = new ArrayList<>();
        for (Treino treino : treinos) {
            if (treino.getProfessor().getNome().equals(professor)) {
                treinosFiltrados.add(treino);
            }
        }
        return treinosFiltrados;
    }

    public List<Treino> getTreinoByNome(String nomeTreino) {
        List<Treino> treinosFiltrados = new ArrayList<>();
        for (Treino treino : treinos) {
            if (treino.getNomeTreino().equals(nomeTreino)) {
                treinosFiltrados.add(treino);
            }
        }
        return treinosFiltrados;
    }


}
