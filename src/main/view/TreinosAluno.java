package main.view;

import main.controller.AlunoTreinoController;
import main.model.Aluno;
import main.model.Treino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class TreinosAluno implements ActionListener {
    private JButton bttreinos;
    private JButton btconfiguracao;
    private JButton btmetas;
    private JButton btsair;
    private JButton btT1;
    private JButton btT2;
    private JButton btT3;
    private JButton voltarhome;
    private Aluno aluno;
    JFrame frame = new JFrame("Treinos");
     //Criando
     public TreinosAluno(Aluno aluno) {
         this.aluno = aluno;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

       //definindo os botões

       voltarhome = new JButton("<");
       voltarhome.setBounds(20, 26, 50, 40);

       bttreinos = new JButton("Treinos");
       bttreinos.setBounds(20, 400, 326, 46);

       btconfiguracao = new JButton("Configurações");
       btconfiguracao.setBounds(20, 450, 326, 46);

       btmetas = new JButton("Metas");
       btmetas.setBounds(20, 500, 326, 46);

       btsair = new JButton("Sair");
       btsair.setBounds(80, 550, 199, 46);

//       //botões do catálogo
//       btT1 = new JButton("FullBody");
//       btT1.setBounds(500, 400, 199, 46);
//
//       btT2 = new JButton("Treino para Hipertrofia Muscular");
//       btT2.setBounds(500, 500, 199, 46);
//
//       btT3 = new JButton("Treino para Perda de Peso");
//       btT3.setBounds(500, 600, 199, 46);

       //BOTÕES DO CATÁLOGO
//       frame.add(btT1);
//       frame.add(btT2);
//       frame.add(btT3);

         AlunoTreinoController alunoTreinoController = new AlunoTreinoController();
         ArrayList<Treino> treinos =  alunoTreinoController.listarTreinosPorAluno(aluno.getId());

         System.out.println("treinos: " + treinos);

         int yPosition = 400; // Posição inicial dos botões
         for (Treino treino : treinos) {
             JButton button = new JButton(treino.getNomeTreino());
             button.setBounds(500, yPosition, 199, 46);
             frame.add(button);

             button.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                  frame.dispose();
                  new VisualizarTreinoAluno(aluno,treino.getId());
                 }
             });

             yPosition += 50;
         }


         //adicionando os botões
       frame.add(bttreinos);
       frame.add(btconfiguracao);
       frame.add(btmetas);
       frame.add(btsair);
       frame.add(voltarhome);

       bttreinos.addActionListener(this);
       btconfiguracao.addActionListener(this);
       btmetas.addActionListener(this);
       btsair.addActionListener(this);
       voltarhome.addActionListener(this);

       // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/TreinosAlunoo.png");  //caminho da imagem
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
        if (e.getSource() == voltarhome) {
            frame.dispose();
            new HomeAluno(aluno);
        }
        if (e.getSource() == bttreinos) {
            frame.dispose();
            new TreinosAluno(aluno);
        }
        if (e.getSource() == btconfiguracao) {
            frame.dispose();
            new ConfiAluno(aluno);
        }
        if (e.getSource() == btmetas) {
            frame.dispose();
            new MetasAluno(aluno);
        }
        if (e.getSource() == btsair) {
            frame.dispose();
            new TelaLoginCadastro();
        }
    }
}
     

