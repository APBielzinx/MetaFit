package main.view;

import main.model.Professor;

import javax.swing.*;
import java.awt.*;

public class HomeProf {
    private JButton btconfiguracaop;
    private JButton btsairp;
    private JButton addTreinos;
    private Professor professor;
    JFrame frame = new JFrame("Home Professor");

    public HomeProf(Professor usuario) {
        this.professor = usuario;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);
        
        //definindo botões
        btconfiguracaop = new JButton("Configurações");
        btconfiguracaop.setBounds(20, 400, 326, 46);

        btsairp = new JButton("Sair");
        btsairp.setBounds(20, 450, 326, 46);

        addTreinos = new JButton("Adicionar +");
        addTreinos.setBounds(800, 400, 326, 46);



        //add botões
        frame.add(btconfiguracaop);
        frame.add(btsairp);
        frame.add(addTreinos);

       // Ajustando a imagem de fundo
      ImageIcon imagemFundo = new ImageIcon("src/main/view/img/HomeProf.png");  //caminho da imagem
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

}
 



    
    

