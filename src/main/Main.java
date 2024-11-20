package main;

import main.controller.Validador;
import main.dao.AlunoDao;
import main.dao.ProfessorDao;
import main.dao.TreinoDao;
import main.model.Professor;
import main.model.Treino;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) 
    {
        AlunoDao alunoDao = new AlunoDao();

        alunoDao.fazerCadastro("Felipe", "petrassifelipe@gmail.com", "12345678910",
        1, 24, "Eme");
    }
}