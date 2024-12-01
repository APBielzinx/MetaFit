package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetasAluno {

private JButton voltarhome;
private JButton addMeta;
private JTextField metaAtual;

public MetasAluno(){
    JFrame frame = new JFrame("Metas");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1280, 800);  
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    // Layout nulo para posicionamento manual
    frame.setLayout(null);

    //definindo JTextField
    metaAtual = new JTextField("Peso Atual: 65kg | MDP: 59kg");  
    metaAtual.setBounds(256, 400, 471, 71);  
    

    frame.add(metaAtual);

    //definindo botões
    voltarhome = new JButton("<");
    voltarhome.setBounds(90, 130, 50, 40);

    addMeta = new JButton("Registrar nova Meta");
    addMeta.setBounds(256, 490, 471, 71);

    frame.add(voltarhome);
    frame.add(addMeta);

    // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("Metas  - Aluno.png");  //caminho da imagem
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
        SwingUtilities.invokeLater(() -> new MetasAluno());
 }
}
