package main.dao;

import main.controller.Validador;
import main.model.Professor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class ProfessorDao {


    ArrayList<Professor> professors = new ArrayList<>();

    Validador validator = new Validador();

    public Professor fazerCadastro(String nome, String email, String senha, int tipo, List<String>especialidades) {

        Professor professor = new Professor(nome, email, senha, tipo, especialidades);

        if (!validator.validarProfessor(professor)){
            //continua na mesma tela e usuario altera as informações erradas
            return null;
        }

        professors.add(professor);
        JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!\n"+professor.getDados(),"Professor", JOptionPane.INFORMATION_MESSAGE);
        return professors.getFirst();
    }



}
