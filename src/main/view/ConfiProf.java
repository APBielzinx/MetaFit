package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfiProf {
    private JButton botaoAlterarp;
    private JButton voltarhomep;
    private JButton excluirContap;
    private JTextField nomep;
    private JTextField especialidade;
    private JTextField emailp;
    private JTextField senhap;

    public ConfiProf() {
        JFrame frame = new JFrame("Configurações");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

        // definindo os JtextField 
    nomep = new JTextField("Miriam Gama Moura da Silva");  
    nomep.setBounds(360, 300, 400, 36);  
    nomep.setForeground(Color.decode("#141831"));

    especialidade = new JTextField("Perda de peso");
    especialidade.setBounds(360, 350, 400, 36);
    especialidade.setForeground(Color.decode("#141831"));

    emailp = new JTextField("miriam123@gmail.com");
    emailp.setBounds(360, 400, 400, 36);
    emailp.setForeground(Color.decode("#141831"));

    senhap = new JTextField("miriam123");
    senhap.setBounds(360, 450, 400, 36);
    senhap.setForeground(Color.decode("#141831"));

    //add ao frame
    frame.add(nomep);
    frame.add(especialidade);
    frame.add(emailp);
    frame.add(senhap);

    //definindo botões
    botaoAlterarp = new JButton("Alterar");
    botaoAlterarp.setBounds(434, 612, 398, 48);

    voltarhomep = new JButton("<");
    voltarhomep.setBounds(30, 100, 50, 40);

    excluirContap = new JButton("Excluir conta");
    excluirContap.setBounds(434, 670, 398, 48);

    //add botões
    frame.add(botaoAlterarp);
    frame.add(voltarhomep);
    frame.add(excluirContap);


     // Ajustando a imagem de fundo
     ImageIcon imagemFundo = new ImageIcon("ConfiPF.png");  //caminho da imagem
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
         SwingUtilities.invokeLater(() -> new ConfiProf());
     
    }
}
