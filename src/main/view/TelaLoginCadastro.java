package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaLoginCadastro {
    private JButton botaoLogin, botaoCadastro;
    private JTextField campoEmail;
    private JPasswordField campoSenha;

    public TelaLoginCadastro() {
        // Criando
        JFrame frame = new JFrame("Tela de Login e Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  // Tamanho da janela
        frame.setLocationRelativeTo(null);  // centraliza a janela na telCea
        frame.setResizable(false);  // Desabilita maximizar 
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

        // Definir os campos de texto para e-mail e senha
        campoEmail = new JTextField();
        campoEmail.setBounds(400, 359, 480, 36);  // Posição e tamanho do campo de e-mail
       

        campoSenha = new JPasswordField();
        campoSenha.setBounds(400, 439, 480, 36);  // Posição e tamanho do campo de senha
       
        

        // Adicionar os campos de texto ao frame
        frame.add(campoEmail);
        frame.add(campoSenha);

        // Definir os botões de Login e Cadastro
        botaoLogin = new JButton("Entrar");
        botaoLogin.setBounds(490, 500, 300, 46);  // Posição e tamanho do botão "Entrar na Home"
        
        botaoCadastro = new JButton("Cadastro");
        botaoCadastro.setBounds(490, 570, 300, 46);  // Posição e tamanho do botão "Cadastro"

        // Adicionar os botões ao frame
        frame.add(botaoLogin);
        frame.add(botaoCadastro);


        // Ajustando a imagem de fundo
        ImageIcon imagemFundo = new ImageIcon("src/main/view/img/telaLoginCadastro.png");  //caminho da imagem
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
//------------------------------------------------------------------------------------------------------------------------------------------

//MAIN ABAIXO


//------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // Executar o código na thread de interface gráfica (Swing)
        SwingUtilities.invokeLater(TelaLoginCadastro::new);
    }
}