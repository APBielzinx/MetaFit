package main.view;

import javax.swing.*;

import main.dao.AlunoDao;
import main.model.Aluno;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarMeta implements ActionListener
{
  private JButton voltarhome;
  private JButton registrar;
  private JTextField pesoAtual;
  private JTextField pesoMeta;
  private JFrame frame;
  private static Aluno aluno;
      
      public AdicionarMeta(Aluno aluno)
      {
      frame = new JFrame("Adicionar Meta");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1280, 800);  
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      // Layout nulo para posicionamento manual
      frame.setLayout(null);
      
      //definindo JTextField
      pesoAtual = new JTextField();
      pesoAtual.setBounds(454, 251, 398, 48); 
      
      pesoMeta = new JTextField();  
      pesoMeta.setBounds(434, 330, 398, 48); 
  
      frame.add(pesoAtual);
      frame.add(pesoMeta);
  
      //definindo botões
      voltarhome = new JButton("<");
      voltarhome.setBounds(90, 130, 50, 40);
  
      registrar = new JButton("Registrar");
      registrar.setBounds(500, 608, 392, 61);
      
      frame.add(voltarhome);
      frame.add(registrar);
  
       // Ajustando a imagem de fundo
      ImageIcon imagemFundo = new ImageIcon("src/main/view/img/Metas.png");  //caminho da imagem
      Image imagem = imagemFundo.getImage();
      Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
      imagemFundo = new ImageIcon(imagemRedimensionada);
  
      // Definir a imagem de fundo no frame
      JLabel fundo = new JLabel(imagemFundo);
      fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela
      frame.add(fundo);
  
      //Definindo os botões
      voltarhome.addActionListener(this);
  
      registrar.addActionListener(this);
  
   
      // Exibir o frame
      frame.setVisible(true);
    }
    public static void main(String[] args) {
      //RODAR
      SwingUtilities.invokeLater(() -> new AdicionarMeta(aluno));
  }

    public void actionPerformed(ActionEvent e) 
    {
      if(e.getSource() == voltarhome)
      {
        frame.dispose();
        new HomeAluno(aluno);
      }
      else if(e.getSource() == registrar)
      {
        JOptionPane.showMessageDialog(null, "Registrado");
        //Adicionar função necessária
      }
      
    }
}
    

