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

        JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!","Usuario", JOptionPane.INFORMATION_MESSAGE);
        return id;

    }


}


