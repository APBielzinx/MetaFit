package main;


import main.controller.AlunoController;
import main.controller.AlunoTreinoController;
import main.controller.ProfessorController;
import main.controller.TreinoController;
import main.model.Aluno;
import main.model.Treino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) 
    {
         AlunoController alunoController = new AlunoController();
     //   alunoController.cadastrar(new Aluno("Gabriel","g@gmail.com","12345678",2,20,"M",40,50));
       // alunoController.atualizarAluno(new Aluno("439e2863-83c2-4bad-a068-ec1bddbe2528","Gabriel","ga@gmail.com","12345678",1,25,"M",40,50));
       //alunoController.fazerLogin("g@gmail.com","12345678");

//
//        ProfessorController profController = new ProfessorController();
//        //profController.cadastrar(new Professor("Gabriel","ga@gmail.com","12345678",1,new ArrayList<>(Arrays.asList("A","b","c"))));
////       profController.atualizar(new Professor("41954bb4-fd23-490a-bb4d-492e9f0741be","Gabriel","ga@gmail.com","123456789",1,new ArrayList<>(Arrays.asList("A","b","d"))));
//        profController.fazerLogin("ga@gmail.com","12345678");
//       // profController.excluir("41954bb4-fd23-490a-bb4d-492e9f0741be");
//
//        TreinoController treinoController = new TreinoController();
//
//        // Cadastrar um novo treino
//        System.out.println("=== Cadastrando um novo treino ===");
//        Treino novoTreino = new Treino(
//                null,
//                "Treino de Força",
//                "Treino voltado para ganho de força muscular",
//                new ArrayList<>(Arrays.asList("Força", "Musculação")),
//                "6689888a-a978-4946-91e9-79ec4a737371",
//                "Realizar 3 séries de 10 repetições"
//        );
//        treinoController.cadastrar(novoTreino);
//        System.out.println("Treino cadastrado com sucesso!");
//
//        // Buscar um treino específico pelo ID
//        System.out.println("\n=== Buscando um treino pelo ID ===");
//        Treino treinoBuscado = treinoController.buscar("ad79375a-3511-4136-bccc-b77b3ea0b52c");
//        if (treinoBuscado != null) {
//            System.out.println("Treino encontrado: " + treinoBuscado.getDados());
//        } else {
//            System.out.println("Treino não encontrado!");
//        }
//
//        // Atualizar um treino existente
//        System.out.println("\n=== Atualizando um treino ===");
//        treinoBuscado.setNomeTreino("Treino de Resistência");
//        treinoBuscado.setDescricaoTreino("Treino voltado para resistência muscular");
//        treinoController.atualizar(treinoBuscado);
//        System.out.println("Treino atualizado com sucesso!");
//
//        // Listar todos os treinos de um professor específico
//        System.out.println("\n=== Listando treinos de um professor ===");
//        List<Treino> treinosDoProfessor = treinoController.listarPorProfessor("6689888a-a978-4946-91e9-79ec4a737371");
//        for (Treino treino : treinosDoProfessor) {
//            System.out.println(treino.getDados());
//        }
//
//        // Excluir um treino pelo ID
//        System.out.println("\n=== Excluindo um treino pelo ID ===");
//        treinoController.excluir("a4dfb0bd-6e91-4db4-b5c5-d9997094d5cb");
//        System.out.println("Treino excluído com sucesso!");
//
        AlunoTreinoController alunoTreinoController = new AlunoTreinoController();

        String idAluno = "09ac0dcf-a1d2-46a9-9156-080f4b71c576"; // Substitua por um ID válido
        String idTreino = "5a609ee9-5751-42c1-9904-8e1ec9f5716f"; // Substitua por um ID válido

        // Cadastrar aluno em um treino
        System.out.println("Cadastrando aluno no treino...");
        alunoTreinoController.cadastrarAlunoEmTreino(idAluno, idTreino);
        System.out.println("Aluno cadastrado com sucesso!");

        // Remover aluno do treino
//        System.out.println("Removendo aluno do treino...");
//        alunoTreinoController.removerAlunoDoTreino(idAluno, idTreino);
//        System.out.println("Aluno removido com sucesso!");

        // Teste: Buscar todos os treinos de um aluno
        System.out.println("=== Listando treinos de um aluno ===");
        List<Treino> treinos = alunoTreinoController.listarTreinosPorAluno(idAluno);

        if (!treinos.isEmpty()) {
            for (Treino treino : treinos) {
                System.out.println(treino.getDados());
            }
        } else {
            System.out.println("Nenhum treino encontrado para o aluno com ID: " + idAluno);
        }
    }

}