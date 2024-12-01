package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroTreinoProf {
    private JButton voltarhomep;
    private JButton registrarT;
    private JTextArea instrucoes;
    private JTextArea objetivo;
    private JTextArea treino;
    private JComboBox<String> especialidadeTreinos; 

    public RegistroTreinoProf(){
        JFrame frame = new JFrame("Registro Treino");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1280, 800);  
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
     // Layout nulo para posicionamento manual
    frame.setLayout(null);

    //definindo botões
    voltarhomep = new JButton("<");
    voltarhomep.setBounds(10, 30, 50, 40);
    frame.add(voltarhomep);
    
    registrarT = new JButton("Registrar");
    registrarT.setBounds(500, 710, 326, 46);
    frame.add(registrarT);

    //definindo os JtextArea
    objetivo = new JTextArea("Digite o objetivo");  
    objetivo.setBounds(50, 99, 500, 100); 


    instrucoes = new JTextArea("Digite as Instruções");  
    instrucoes.setBounds(50, 250, 300, 300); 

    treino = new JTextArea("Digite o Treino");  
    treino.setBounds(700, 99, 500, 600); 

    frame.add(objetivo);
    frame.add(instrucoes);
    frame.add(treino);

     // Criar o JComboBox para selecionar a especialidade
     String[] especialidades = {
        "Treino para Hipertrofia Muscular",
        "Treino para Perda de Peso",
        "FullBody"
    };
    especialidadeTreinos = new JComboBox<>(especialidades);
    especialidadeTreinos.setBounds(460, 30, 500, 30);  // Ajustar a posição e o tamanho
    frame.add(especialidadeTreinos);

      

    // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/RegistroTreinoProfessor.jpg");  //caminho da imagem
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

    public static void main(String[] args) {
        //RODAR
        SwingUtilities.invokeLater(() -> new RegistroTreinoProf());



    }   
}
