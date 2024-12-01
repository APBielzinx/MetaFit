package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadProf {
    private JButton botaoConcluirCadP;
    private JTextField nomep;
    private JTextField especialidade;
    private JTextField emailp;
    private JTextField senhap;
    
    //Criando
    public TelaCadProf(){
        JFrame frame= new JFrame("Cadastro do professor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);
        //definindo botão
    botaoConcluirCadP = new JButton("Concluir");
    botaoConcluirCadP.setBounds(434, 612, 398, 48);  // Posição e tamanho do botão 
    // Adicionar o botão
     frame.add(botaoConcluirCadP);


    // definindo os JtextField 
     nomep = new JTextField("Digite seu nome");  // Texto placeholder
     nomep.setBounds(360, 300, 400, 36);  // Posição e tamanho do campo
     nomep.setForeground(Color.decode("#141831"));  // Cor do texto placeholder em HEX 
     
     especialidade = new JTextField("Sua Especialidade");
     especialidade.setBounds(360, 350, 400, 36);
     especialidade.setForeground(Color.decode("#141831"));

     emailp = new JTextField("Informe seu e-mail");
     emailp.setBounds(360, 400, 400, 36);
     emailp.setForeground(Color.decode("#141831"));

     senhap = new JTextField("Crie uma senha");
     senhap.setBounds(360, 450, 400, 36);
     senhap.setForeground(Color.decode("#141831"));

    //add ap frame
    frame.add(nomep);
    frame.add(especialidade);
    frame.add(emailp);
    frame.add(senhap);

   // Ajustando a imagem de fundo
   ImageIcon imagemFundo = new ImageIcon("src\\main\\view\\CadastroAluno.png");  //caminho da imagem
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
       SwingUtilities.invokeLater(() -> new TelaCadProf());
   
    }
}