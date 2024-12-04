package main.view;

import main.controller.AlunoController;
import main.controller.AlunoTreinoController;
import main.controller.TreinoController;
import main.model.Aluno;
import main.model.Professor;
import main.model.Treino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Objects;

public class InscricaoAluno implements ActionListener {
    private JButton voltarhome;
    private JButton inscricao;
    private JTextArea instrucoes;
    private JTextArea objetivo;
    private JTextArea treino;
    private JLabel especialidadeTreinos; 
    private  Aluno aluno;
    private String idTreino;
    JFrame frame = new JFrame("Inscrição");
    //Criando
    public InscricaoAluno(String idTreino, Aluno aluno) {
        this.aluno = aluno;
        this.idTreino = idTreino;
        System.out.println(aluno.getId()+"\n"+idTreino);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

         //definindo botão
    voltarhome = new JButton("<");
    voltarhome.setBounds(10,30,50,40);  // Posição e tamanho do botão 
    inscricao = new JButton("Increver-se");
    inscricao.setBounds(500,710,326,46);
    //jlabel

    especialidadeTreinos = new JLabel("Especialidade do Treino");
    especialidadeTreinos.setBounds(460, 30, 500, 30);
    especialidadeTreinos.setFont(new Font("Arial", Font.BOLD, 34));
    especialidadeTreinos.setForeground(new Color(50, 234, 216));

    //add botão
    frame.add(voltarhome);
    frame.add(inscricao);

    voltarhome.addActionListener(this);
    inscricao.addActionListener(this);



    objetivo = new JTextArea("Objetivo:");  
    objetivo.setBounds(50, 99, 500, 100); 

    instrucoes = new JTextArea("Instruções:");  
    instrucoes.setBounds(50, 250, 300, 300); 

    treino = new JTextArea("Treino:");  
    treino.setBounds(700, 99, 500, 600); 
    
    frame.add(objetivo);
    frame.add(instrucoes);
    frame.add(treino);
    frame.add(especialidadeTreinos);
    // Ajustando a imagem de fundo
   ImageIcon imagemFundo = new ImageIcon("src/main/view/img/InscricaoAluno.png");  //caminho da imagem
   Image imagem = imagemFundo.getImage();
   Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
   imagemFundo = new ImageIcon(imagemRedimensionada);

// Definir a imagem de fundo no frame
   JLabel fundo = new JLabel(imagemFundo);
   fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela
   frame.add(fundo);
   frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltarhome) {
            frame.dispose();
            new HomeAluno(aluno);
        }
        if (e.getSource() == inscricao) {
            AlunoTreinoController alunoTreinoController = new AlunoTreinoController();

            alunoTreinoController.cadastrarAlunoEmTreino(aluno.getId(), idTreino);
            JOptionPane.showMessageDialog(frame, "Aluno cadastrado com sucesso!");
        }
    }
}
