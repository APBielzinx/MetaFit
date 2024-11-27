package main;


import main.controller.Validador;
import main.dao.AlunoDao;
import main.dao.UsuarioDao;



public class Main {
    public static void main(String[] args) 
    {
        Validador validador = new Validador();
        UsuarioDao usuarioDao = new UsuarioDao();
        String idUsuario = usuarioDao.cadastrarUsuario("Gabriel","gabriel@gmail.com","010203cd",2);
        AlunoDao alunoDao =  new AlunoDao();
        alunoDao.cadastrarAluno(idUsuario, 20, 64.0, "f", 45.9);

    }
}