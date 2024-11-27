package main;


import main.controller.AlunoController;

import main.model.Aluno;



public class Main {
    public static void main(String[] args) 
    {
        AlunoController alunoController = new AlunoController();
        //alunoController.cadastrarAluno(new Aluno("Gabriel","g@gmail.com","12345678",1,20,"M",40,50));
       // alunoController.atualizarAluno(new Aluno("439e2863-83c2-4bad-a068-ec1bddbe2528","Gabriel","ga@gmail.com","12345678",1,25,"M",40,50));
        alunoController.excluirAluno("439e2863-83c2-4bad-a068-ec1bddbe2528");
    }
}