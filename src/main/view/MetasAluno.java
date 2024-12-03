package main.view;

import main.controller.AlunoController;
import main.model.Aluno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetasAluno implements ActionListener {

private JButton voltarhome;
private JButton addMeta;
private JTextField metaAtual;
private Aluno aluno;
JFrame frame = new JFrame("Metas");

public MetasAluno(Aluno aluno){
    this.aluno = aluno;

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1280, 800);  
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    // Layout nulo para posicionamento manual
    frame.setLayout(null);
    System.out.println(aluno.getPesoMeta());
    String meta = (aluno.getPesoMeta() != 0 ? ""+aluno.getPesoMeta() : "");
    System.out.println("a"+meta);
    //definindo JTextField
    metaAtual = new JTextField("Peso Atual: "+aluno.getPeso()+"| MDP:"+meta);
    metaAtual.setBounds(256, 400, 471, 71);  
    

    frame.add(metaAtual);

    //definindo botões
    voltarhome = new JButton("<");
    voltarhome.setBounds(90, 130, 50, 40);

    addMeta = new JButton("Registrar nova Meta");
    addMeta.setBounds(256, 490, 471, 71);

    frame.add(voltarhome);
    frame.add(addMeta);

    voltarhome.addActionListener(this);
    addMeta.addActionListener(this);

    // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/MetasAcesso.png");  //caminho da imagem
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltarhome) {
            frame.dispose();
            new HomeAluno(aluno);
        }
        if (e.getSource() == addMeta) {
            String texto = metaAtual.getText();
            if (texto.contains("MDP:")) {
                String[] partes = texto.split("MDP:");
                if (partes.length > 1) {
                    String metaDigitada = partes[1].trim();
                    try {
                        double numeroMeta = Double.parseDouble(metaDigitada);
                        AlunoController alunoController = new AlunoController();
                        aluno.setPesoMeta(numeroMeta);
                        alunoController.atualizar(aluno);
                        JOptionPane.showMessageDialog(frame, "Meta de peso atualizada com sucesso!");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Por favor, insira um número válido após 'MDP:'");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Digite sua meta após 'MDP:'");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Formato inválido. Certifique-se de incluir 'MDP:' no texto.");
            }

        }
}
}
