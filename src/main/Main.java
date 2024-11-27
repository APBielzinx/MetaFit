package main;


import java.util.ArrayList;
import java.util.Arrays;

import main.controller.Validador;
import main.dao.AlunoDao;
import main.dao.ProfessorDao;
import main.dao.UsuarioDao;



public class Main {
    public static void main(String[] args) 
    {
        Validador validador = new Validador();
        UsuarioDao usuarioDao = new UsuarioDao();
        String idProfessor = usuarioDao.cadastrarUsuario("Prof", "aquivaiemail@gmail.com", "Qualquercoisa", 1);
        ProfessorDao professorDao = new ProfessorDao();
        ArrayList<String> especialidades = new ArrayList<>(Arrays.asList("Hipertrofia", "Emagrecimento"));
        professorDao.cadastrarProfesssor(idProfessor, especialidades );

    }
}