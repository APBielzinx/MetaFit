package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JOptionPane;

import main.controller.Validador;
import main.model.Aluno;

public class AlunoDao 
{
   Connection conn = ConnFactory.getConn();
   public void cadastrarAluno(String idUsuario, int idade, double peso, String genero, double pesoMeta) {
    String sql = "INSERT INTO Aluno(idAluno, idUsuario, idade, peso, genero, pesoMeta) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement stmt = null;

    try {
  
        stmt = conn.prepareStatement(sql);

        
        stmt.setString(1, UUID.randomUUID().toString()); 
        stmt.setString(2, idUsuario);
        stmt.setInt(3, idade);
        stmt.setDouble(4, peso);
        stmt.setString(5, genero);
        stmt.setDouble(6, pesoMeta);

        // Executando a atualização no banco de dados
        stmt.executeUpdate();

    } catch (SQLException e) {
        try {
            conn.rollback();
        } catch (SQLException ex) {
            System.out.println("Erro ao realizar o rollback: " + ex.toString());
        }
        System.out.println("Erro ao incluir os dados: " + e.toString());
    } finally {
        ConnFactory.closeConn(conn, stmt);
    }

    JOptionPane.showMessageDialog(null, "Seja bem-vindo!");
 }
}


