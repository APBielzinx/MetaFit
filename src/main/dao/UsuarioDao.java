package main.dao;

import main.model.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;


public class UsuarioDao {

    Connection conn = ConnFactory.getConn();



    public String cadastrarUsuario(String nome, String email, String senha, int tipo) {

        String sql = "INSERT INTO usuario (idUsuario,nome,email,senha,tipo) VALUES (?,?,?,?,?)";

        PreparedStatement stmt = null;
        String id = UUID.randomUUID().toString();
        try {

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id); // gera um UUID aleatorio e ja o convete para String para fazer o insert
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.setString(4, senha);
            stmt.setInt(5, tipo);
            stmt.executeUpdate();

        }  catch(SQLException e)
        {   try
        {   conn.rollback();
        }
        catch(SQLException ex)
        {   System.out.println("Erro ao incluir os dados" + ex.toString());
        }
        }
        finally
        {   ConnFactory.closeConn(conn, stmt);
        }
        return id;

    }

    public void atualizarUsuario(String idUsuario, String nome, String email, String senha, int tipo) {
        conn = ConnFactory.getConn();
        String sql = "UPDATE Usuario SET nome = ?, email = ?, senha = ?, tipo = ? WHERE idUsuario = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, senha);
            stmt.setInt(4, tipo);
            stmt.setString(5, idUsuario);
            stmt.executeUpdate();

            System.out.println("Dados do usuário atualizados com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar os dados do usuário: " + e.toString());
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }

    public void deletarUsuario(String idUsuario) {
        String sql = "DELETE FROM Usuario WHERE idUsuario = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idUsuario);
            stmt.executeUpdate();

            System.out.println("Usuário deletado com sucesso!");

        }  catch(SQLException e) {
            try {
                conn.rollback();
        }
        catch(SQLException ex) {
            System.out.println("Erro ao excluir os dados" + ex.toString());
        }
        }
        finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }



}


