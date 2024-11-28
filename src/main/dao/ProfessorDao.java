package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;

import main.model.Professor;


public class ProfessorDao 
{
    Connection conn = ConnFactory.getConn();
    public void cadastrarProfesssor(String idUsuario, List<String> especialidades) 
    {
        String sqlInsert = "INSERT INTO Professor(idProfessor, idUsuario, especialidades) VALUES (?, ?, ?)";
        PreparedStatement stmt = null;

        try 
        {
            stmt = conn.prepareStatement(sqlInsert);
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

    public Professor buscarProfessor(String idUsuario)
    {
        conn = ConnFactory.getConn();
        String sqlSelect = "SELECT u.idUsuario, u.nome, u.email, u.senha, u.tipo, p.especialidades FROM Usuario u JOIN Professor a ON u.idUsuario = p.idUsuario WHERE u.idUsuario = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try
        {   
            stmt = conn.prepareStatement(sqlSelect);
            stmt.setString(1, idUsuario);
            rs = stmt.executeQuery();

            if(rs.next())
            {
                String sEspecialidades = rs.getString("Especialidades");
                List<String> especialidades = Arrays.asList(sEspecialidades.split(","));
                 return new Professor(rs.getString("idUsuario"),
                 rs.getString("Nome"),
                 rs.getString("Email"),
                 rs.getString("Senha"),
                 rs.getInt("Tipo"),
                 especialidades);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
                return null;
            }
        }

        catch(SQLException ex)
        {
               System.out.println("Erro ao consultar os dados" + ex.toString());
        }
        finally
        {
               ConnFactory.closeConn(conn, stmt);
        }

        return null;
    } 

    public void atualizarProfessor(String idUsuario, String nome, String email, String senha, List<String> especialidades)
    {   
        String   sqlUpdate = "UPDATE Professor SET nome = ?, email = ?, senha = ?, especialidades = ? WHERE idUsuario = ?";
        conn = ConnFactory.getConn();
        PreparedStatement stmt = null;

        try
        {   
            stmt = conn.prepareStatement(sqlUpdate);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, senha);
            stmt.setString(3, String.join(",", especialidades));
            stmt.executeUpdate();
        }
        catch(SQLException e)
        {   
            try
            {
               conn.rollback();
            }
            catch(SQLException ex)
            {   
                System.out.println("Erro ao alterar os dados" + ex.toString());
            }
        }
        finally
        {   
            ConnFactory.closeConn(conn, stmt);
        }       
    }  
    
    public void excluirProfessor(String idUsuario)
    {   
        String   sqlDelete = "DELETE FROM Professor WHERE idUsuario = ?";
        conn = ConnFactory.getConn();
        PreparedStatement stmt = null;

        try
        {   
            stmt = conn.prepareStatement(sqlDelete);
            stmt.setString(1, idUsuario);
            stmt.executeUpdate();
        }
        
        catch(SQLException e)
        {   
            try
            {   
                conn.rollback();
            }
            catch(SQLException ex)
            {   
                System.out.println("Erro ao excluir os dados" + ex.toString());
            }
        }
        finally
        {   
            ConnFactory.closeConn(conn, stmt);
        }       
    }
}