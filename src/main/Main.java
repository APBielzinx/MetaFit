package main;


import main.controller.AlunoController;
import main.controller.AlunoTreinoController;
import main.controller.ProfessorController;
import main.controller.TreinoController;
import main.controller.utils.CriptografarSenha;
import main.model.Aluno;
import main.model.Professor;
import main.model.Treino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) 
    {
//        System.out.println("=== Cadastrando um aluno ===");
       AlunoController alunoController = new AlunoController();
//       alunoController.cadastrar(new Aluno("Gabriel","ga@gmail.com","12345678",2,20,"M",40,50));
//        Aluno aluno = alunoController.fazerLogin("ga@gmail.com","12345678");
//        alunoController.atualizar(new Aluno(aluno.getId(),"Gabriel","ga@gmail.com","123456789",2,25,"M",40,50));
//       alunoController.fazerLogin("ga@gmail.com","123456789");
//       alunoController.buscar(aluno.getId());
//       alunoController.excluir(aluno.getId());
//
//        System.out.println("=== Cadastrando um professor ===");
          ProfessorController profController = new ProfessorController();
//        profController.cadastrar(new Professor("Gabriel","gaProf@gmail.com","12345678",1,new ArrayList<>(Arrays.asList("A","b","c"))));
//        Professor professor =  profController.fazerLogin("gaProf@gmail.com","12345678");
//        profController.atualizar(new Professor(professor.getId(),"Gabriel","gaProf@gmail.com","123456789",1,new ArrayList<>(Arrays.asList("A","b","d"))));
//        profController.fazerLogin("gaProf@gmail.com","123456789");
//        profController.buscar(professor.getId());
//        profController.excluir(professor.getId());

        System.out.println("=== Cadastrando um novo treino ===");

     //  profController.cadastrar(new Professor("Gabriel","gaProf@gmail.com","12345678",1,new ArrayList<>(Arrays.asList("A","b","c"))));
        Professor professorTreino =  profController.fazerLogin("gaProf@gmail.com","12345678");

        TreinoController treinoController = new TreinoController();
        Treino novoTreino = new Treino(
               "Treino de Força",
                "Treino voltado para ganho de força muscular",
                new ArrayList<>(Arrays.asList("Força", "Musculação")),
                professorTreino.getId(),
                "Realizar 3 séries de 10 repetições"
       );
        treinoController.cadastrar(novoTreino);
        System.out.println("Treino cadastrado com sucesso!");

        System.out.println("\n=== Listando treinos de um professor ===");
        System.out.println(professorTreino.getId());
        List<Treino> treinosDoProfessor = treinoController.listarPorProfessor(professorTreino.getId());
        System.out.println(treinosDoProfessor);
       Treino treino =  treinosDoProfessor.getFirst();

       System.out.println("\n=== Buscando um treino pelo ID ===");
       Treino treinoBuscado = treinoController.buscar(treino.getId());

        System.out.println("\n=== Atualizando um treino ===");
        treinoBuscado.setNomeTreino("Treino de Resistência");
        treinoBuscado.setDescricaoTreino("Treino voltado para resistência muscular");
       treinoController.atualizar(treinoBuscado);
       System.out.println("Treino atualizado com sucesso!");

        //Listar todos os treinos de um professor específico

      treinosDoProfessor.forEach(t -> System.out.println(t.toString()));



        System.out.println("\n=== Excluindo um treino pelo ID ===");
        treinoController.excluir(treino.getId());
       System.out.println("Treino excluído com sucesso!");

        AlunoTreinoController alunoTreinoController = new AlunoTreinoController();

        alunoController.cadastrar(new Aluno("Gabriel","ga@gmail.com","12345678",2,20,"M",40,50));
        Aluno alunoTreino =   alunoController.fazerLogin("ga@gmail.com","12345678");

        Treino novoTreinoAluno = new Treino(
                "Treino de Força",
                "Treino voltado para ganho de força muscular",
                new ArrayList<>(Arrays.asList("Força", "Musculação")),
                professorTreino.getId(),
                "Realizar 3 séries de 10 repetições"
        );

        treinoController.cadastrar(novoTreino);
//        String idAluno = alunoTreino.getId(); // Substitua por um ID válido
//        String idTreino = novoTreinoAluno.getId(); // Substitua por um ID válido
//
//        // Cadastrar aluno em um treino
//        System.out.println("Cadastrando aluno no treino...");
//        alunoTreinoController.cadastrarAlunoEmTreino(idAluno, idTreino);
//        System.out.println("Aluno cadastrado com sucesso!");

        // Remover aluno do treino
//        System.out.println("Removendo aluno do treino...");
//        alunoTreinoController.removerAlunoDoTreino(idAluno, idTreino);
//        System.out.println("Aluno removido com sucesso!");

        // Teste: Buscar todos os treinos de um aluno
//        System.out.println("=== Listando treinos de um aluno ===");
//        List<Treino> treinos = alunoTreinoController.listarTreinosPorAluno(idAluno);
//
//        if (!treinos.isEmpty()) {
//            for (Treino t : treinos) {
//                System.out.println(t.toString());
//            }
//        } else {
//            System.out.println("Nenhum treino encontrado para o aluno com ID: " + idAluno);
//        }
   }


}