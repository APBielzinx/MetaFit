package main.dao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.controller.Validador;
import main.model.Aluno;

public class AlunoDao 
{
    ArrayList<Aluno> alunos = new ArrayList<>();

    Validador validador = new Validador();

    public Aluno fazerCadastro(String nome, String email, String senha, int tipo, int idade, String genero)
    {
        Aluno aluno = new Aluno(nome, email, senha, tipo, idade, genero);
        if(!validador.validarAluno(aluno))
        {
            return null;
        }

        alunos.add(aluno);
        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso"
         + aluno.getDados());
         return aluno;
    }
}
