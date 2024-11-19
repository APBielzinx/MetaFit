package main.dao;
import main.model.*;
import java.util.ArrayList;

public class UsuarioDao {
 
    // Criando arraylist
    private ArrayList<Usuario> usuarios;

    // Construtor
    private UsuarioDao() {
        usuarios = new ArrayList<>();
    }

    // Add usuário
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método de login
    public String login(String email, String senha) {
        //Identificação
        for (Usuario usuario : usuarios) 
        {
            // Verifica se o email e a senha batem
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                //Verificando acesso
                if (usuario.getTipo() == 1) {
                    return "Login bem-sucedido! Olá, professor";
                } else if (usuario.getTipo() == 2) {
                    return "Login bem-sucedido! Olá, aluno!";
                }
            }
        }
        // Caso o login não seja bem-sucedido
        return "Login falhou! Usuário não cadastrado.";
    }
}


//Tipo 1 Login Professor
//Tipo 2 Login Aluno