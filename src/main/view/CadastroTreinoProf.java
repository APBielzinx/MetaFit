package main.view;

import main.model.Professor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTreinoProf implements ActionListener
{
    private JButton avancar;
    private JTextField nomeTreino;
    private JTextArea objetivo;
    private JButton voltarhomep;
    JFrame frame = new JFrame("Cadastro inicial do Treino");
    private Professor professor;

    
    public CadastroTreinoProf(Professor professor)
    {
        this.professor = professor;

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
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/CadastroTreinoProfessor.png");  //caminho da imagem
    Image imagem = imagemFundo.getImage();
    Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
    imagemFundo = new ImageIcon(imagemRedimensionada);

    // Definir a imagem de fundo no frame
    JLabel fundo = new JLabel(imagemFundo);
    fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela
    frame.add(fundo);

    voltarhomep.addActionListener(this);
    avancar.addActionListener(this);

    
    
    // Exibir o frame
    frame.setVisible(true);
}


    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == voltarhomep) {
           frame.dispose();
           new HomeProf(professor);
       }
       if (e.getSource() == avancar) {
           frame.dispose();
           new RegistroTreinoProf(professor,nomeTreino.getText());
       }
}


}
