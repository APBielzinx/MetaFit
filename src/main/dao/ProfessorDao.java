package main.dao;

import main.controller.Validador;
import main.model.Professor;

import javax.swing.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class ProfessorDao 
{
    Connection conn = ConnFactory.getConn();
    public void cadastrarProfesssor(String idUsuario, ArrayList<String> especialidades) 
    {
        String sql = "INSERT INTO Professor(idProfessor, idUsuario, especialidades) VALUES (?, ?, ?)";
        PreparedStatement stmt = null;

        try 
        {
            stmt = conn.prepareStatement(sql);

            
            stmt.setString(1, UUID.randomUUID().toString()); 
            stmt.setString(2, idUsuario);
            stmt.setString(3, String.join(",", especialidades));
            stmt.executeUpdate();
        } 
        catch (SQLException e) 
        {
            try 
            {
                conn.rollback();
            } 
            catch (SQLException ex) 
            {
                System.out.println("Erro ao realizar o rollback: " + ex.toString());
            }
            System.out.println("Erro ao incluir os dados: " + e.toString());
        } 
        finally 
        {
            ConnFactory.closeConn(conn, stmt);
        }
    }
}
