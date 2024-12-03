package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEscolha implements ActionListener {
    private JButton botaoAluno, botaoProfessor;
    JFrame frame = new JFrame("Opções de Cadastro");

    //criando
    public TelaEscolha() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

        // Definir os botões de aluno e professor
        botaoAluno = new JButton("Aluno");
        botaoAluno.setBounds(108, 367, 398, 48);  // Posição e tamanho do botão 

        botaoProfessor = new JButton("Professor");
        botaoProfessor.setBounds(699, 367, 398, 48);  // Posição e tamanho do botão 

    

        // Adicionar os botões ao frame
        frame.add(botaoAluno);
        frame.add(botaoProfessor);
        botaoAluno.addActionListener(this);
        botaoProfessor.addActionListener(this);


       
        // Ajustando a imagem de fundo
        ImageIcon imagemFundo = new ImageIcon("src/main/view/img/usuárioNaoCadastrado.png");  //caminho da imagem
        Image imagem = imagemFundo.getImage();
        Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
        imagemFundo = new ImageIcon(imagemRedimensionada);

        // Definir a imagem de fundo no frame
        JLabel fundo = new JLabel(imagemFundo);
        fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela
        frame.add(fundo);

        // Exibir o frame
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoAluno) {
            frame.dispose();
            new TelaCadAluno();
        }
        else if(e.getSource() == botaoProfessor)
        {
            frame.dispose();
            new TelaCadProf();
        }
    }
}
