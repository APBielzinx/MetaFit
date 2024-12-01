package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadAluno {
    private JButton botaoConcluirCad;
    private JTextField nome;
    private JTextField idade;
    private JTextField email;
    private JTextField peso;
    private JTextField genero;
    private JTextField senha;


    //Criando
    public TelaCadAluno() {
        JFrame frame = new JFrame("Cadastro do aluno");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

    //definindo botão
    botaoConcluirCad = new JButton("Concluir");
    botaoConcluirCad.setBounds(434, 612, 398, 48);  // Posição e tamanho do botão 
    // Adicionar o botão
     frame.add(botaoConcluirCad);


     // definindo os JtextField 
    nome = new JTextField("Digite seu nome");  // Texto placeholder
    nome.setBounds(360, 300, 400, 36);  // Posição e tamanho do campo
    nome.setForeground(Color.decode("#141831"));  // Cor do texto placeholder em HEX 

    idade = new JTextField("Informe sua idade");
    idade.setBounds(360, 350, 400, 36);
    idade.setForeground(Color.decode("#141831"));

    email = new JTextField("Informe seu e-mail");
    email.setBounds(360, 400, 400, 36);
    email.setForeground(Color.decode("#141831"));

    peso = new JTextField("Peso");
    peso.setBounds(360, 450, 400, 36);
    peso.setForeground(Color.decode("#141831"));

    genero = new JTextField("Gênero (F) OU (M)");
    genero.setBounds(360, 500, 400, 36);
    genero.setForeground(Color.decode("#141831"));

    senha = new JTextField("Crie uma senha");
    senha.setBounds(360, 550, 400, 36);
    senha.setForeground(Color.decode("#141831"));





    // add ao frame
    frame.add(nome);
    frame.add(idade);
    frame.add(email);
    frame.add(peso);
    frame.add(genero);
    frame.add(senha);

    // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/CadastroAluno.png");  //caminho da imagem
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
        SwingUtilities.invokeLater(() -> new TelaCadAluno());
    
}
}
   

