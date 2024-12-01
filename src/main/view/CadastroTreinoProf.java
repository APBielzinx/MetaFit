package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTreinoProf {
    private JButton avancar;
    private JTextField nomeTreino;
    private JTextArea objetivo;
    private JButton voltarhomep;


    
    public CadastroTreinoProf(){
    JFrame frame = new JFrame("Cadastro inicial do Treino");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1280, 800);  
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
     // Layout nulo para posicionamento manual
    frame.setLayout(null);

    //definindo botões
    avancar = new JButton("AVANÇAR");
    avancar.setBounds(500, 550, 326, 46);
    frame.add(avancar);

    voltarhomep = new JButton("<");
    voltarhomep.setBounds(30, 100, 50, 40);
    frame.add(voltarhomep);

    //definindo JTextField
    nomeTreino = new JTextField(" ");  
    nomeTreino.setBounds(360, 240, 400, 36);

    objetivo = new JTextArea("");  
    objetivo.setBounds(360, 290, 500, 100); 
    
   


   
    frame.add(nomeTreino);
    frame.add(objetivo);

    // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src\\main\\view\\CadastroTreinoProf.png");  //caminho da imagem
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
        SwingUtilities.invokeLater(() -> new CadastroTreinoProf());

    }
}
