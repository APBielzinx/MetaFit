package main.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TreinosAluno {
    private JButton bttreinos;
    private JButton btconfiguracao;
    private JButton btmetas;
    private JButton btsair;
    private JButton btT1;
    private JButton btT2;
    private JButton btT3;
    private JButton voltarhome;
    

     //Criando
     public TreinosAluno() {
        JFrame frame = new JFrame("Treinos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

       //definindo os botões

       voltarhome = new JButton("<");
       voltarhome.setBounds(20, 26, 50, 40);

       bttreinos = new JButton("Treinos");
       bttreinos.setBounds(20, 400, 326, 46);

       btconfiguracao = new JButton("Configurações");
       btconfiguracao.setBounds(20, 450, 326, 46);

       btmetas = new JButton("Metas");
       btmetas.setBounds(20, 500, 326, 46);

       btsair = new JButton("Sair");
       btsair.setBounds(80, 550, 199, 46);

       //botões do catálogo
       btT1 = new JButton("FullBody");
       btT1.setBounds(500, 400, 199, 46);
       
       btT2 = new JButton("Treino para Hipertrofia Muscular");
       btT2.setBounds(500, 500, 199, 46);

       btT3 = new JButton("Treino para Perda de Peso");
       btT3.setBounds(500, 600, 199, 46);

       //BOTÕES DO CATÁLOGO
       frame.add(btT1);
       frame.add(btT2);
       frame.add(btT3);



       



       //adicionando os botões
       frame.add(bttreinos);
       frame.add(btconfiguracao);
       frame.add(btmetas);
       frame.add(btsair);
       frame.add(voltarhome);
       // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/TreinosAlunoo.png");  //caminho da imagem
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
        SwingUtilities.invokeLater(() -> new TreinosAluno());
    
    }
}
     

