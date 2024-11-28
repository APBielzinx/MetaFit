package main.controller;

public interface UsuarioController {

    void cadastrar(Object o);
    Object buscar(String id);
    void atualizar(Object o);
    void excluir(String id);
    Object fazerLogin(String email, String senha);
}
