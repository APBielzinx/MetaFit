package main;


import main.controller.Validador;
import main.dao.UsuarioDao;



public class Main {
    public static void main(String[] args) 
    {
        Validador validador = new Validador();
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.cadastrarUsuario("Gabriel","gabriel@gmail.com","010203cd",2);
    }
}