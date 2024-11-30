package main;


import main.controller.AlunoController;
import main.controller.ProfessorController;
import main.model.Professor;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) 
    {
         AlunoController alunoController = new AlunoController();
      // alunoController.cadastrar(new Aluno("Gabriel","g@gmail.com","12345678",2,20,"M",40,50));
       // alunoController.atualizarAluno(new Aluno("439e2863-83c2-4bad-a068-ec1bddbe2528","Gabriel","ga@gmail.com","12345678",1,25,"M",40,50));
       //alunoController.fazerLogin("g@gmail.com","12345678");

        ProfessorController profController = new ProfessorController();
        //profController.cadastrar(new Professor("Gabriel","ga@gmail.com","12345678",1,new ArrayList<>(Arrays.asList("A","b","c"))));
//       profController.atualizar(new Professor("41954bb4-fd23-490a-bb4d-492e9f0741be","Gabriel","ga@gmail.com","123456789",1,new ArrayList<>(Arrays.asList("A","b","d"))));
        profController.fazerLogin("ga@gmail.com","123456789");
       // profController.excluir("41954bb4-fd23-490a-bb4d-492e9f0741be");

    }
}