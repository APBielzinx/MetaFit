package main.view;

import javax.swing.*;

import main.controller.ProfessorController;
import main.model.Professor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TelaCadProf implements ActionListener
{
    private JButton botaoConcluirCad;
    private JTextField nome, especialidade, email, senha;
    private JFrame frame;
    
    //Criando
    public TelaCadProf()
    {
        JFrame frame= new JFrame("Cadastro do professor");
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
        nome.setCaretPosition(0);
        
        
        especialidade = new JTextField();
        especialidade.setBounds(360, 350, 400, 36);
        especialidade.setForeground(Color.decode("#141831"));

        email = new JTextField();
        email.setBounds(360, 400, 400, 36);
        email.setForeground(Color.decode("#141831"));

        senha = new JTextField();
        senha.setBounds(360, 450, 400, 36);
        senha.setForeground(Color.decode("#141831"));

        //add ap frame
        frame.add(nome);
        frame.add(especialidade);
        frame.add(email);
        frame.add(senha);

        // Ajustando a imagem de fundo
        ImageIcon imagemFundo = new ImageIcon("src/main/view/img/CadastroProfessor.png");  //caminho da imagem
        Image imagem = imagemFundo.getImage();
        Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
        imagemFundo = new ImageIcon(imagemRedimensionada);

        // Definir a imagem de fundo no frame
        JLabel fundo = new JLabel(imagemFundo);
        fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela
        frame.add(fundo);

   
   
        // Exibir o frame
        frame.setVisible(true);

        botaoConcluirCad.addActionListener(this);
    }

   public static void main(String[] args) {
       //RODAR
       SwingUtilities.invokeLater(() -> new TelaCadProf());
   
    }


    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == botaoConcluirCad) 
        {
            ProfessorController professorController  = new ProfessorController();
            Professor professor = professorController.cadastrar(new Professor(nome.getText(), especialidade.getText(), email.getText(), senha.getText(), 1, null));
            if (professor != null) 
            {
                JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
                frame.dispose();
                new TelaLoginCadastro();
            }
        }
    }
}