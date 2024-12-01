package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfiAluno {
    private JButton botaoAlterar;
    private JButton voltarhome;
    private JButton excluirConta;
    private JTextField nome;
    private JTextField idade;
    private JTextField email;
    private JTextField peso;
    private JTextField genero;
    private JTextField senha;

    public ConfiAluno() {
        JFrame frame = new JFrame("Configurações");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

           // definindo os JtextField 
    nome = new JTextField("Miriam Gama Moura da Silva");  
    nome.setBounds(360, 300, 400, 36);  
    nome.setForeground(Color.decode("#141831"));

    idade = new JTextField("18");
    idade.setBounds(360, 350, 400, 36);
    idade.setForeground(Color.decode("#141831"));

    email = new JTextField("miriam123@gmail.com");
    email.setBounds(360, 400, 400, 36);
    email.setForeground(Color.decode("#141831"));

    peso = new JTextField("64");
    peso.setBounds(360, 450, 400, 36);
    peso.setForeground(Color.decode("#141831"));

    genero = new JTextField("F");
    genero.setBounds(360, 500, 400, 36);
    genero.setForeground(Color.decode("#141831"));

    senha = new JTextField("mimi123");
    senha.setBounds(360, 550, 400, 36);
    senha.setForeground(Color.decode("#141831"));





    // add ao frame
    frame.add(nome);
    frame.add(idade);
    frame.add(email);
    frame.add(peso);
    frame.add(genero);
    frame.add(senha);


    //definindo botões
    botaoAlterar = new JButton("Alterar");
    botaoAlterar.setBounds(434, 612, 398, 48);

    voltarhome = new JButton("<");
    voltarhome.setBounds(30, 100, 50, 40);

    excluirConta = new JButton("Excluir conta");
    excluirConta.setBounds(434, 670, 398, 48);

    //add botões
    frame.add(botaoAlterar);
    frame.add(voltarhome);
    frame.add(excluirConta);


     // Ajustando a imagem de fundo
     ImageIcon imagemFundo = new ImageIcon("ConfAl.png");  //caminho da imagem
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
         SwingUtilities.invokeLater(() -> new ConfiAluno());
     
    }
    
}
