package main.model;

//Classe mãe Usuário

//Atributos
public class Usuario
{
private String nome;
private String email;
private String senha;
private int tipo;

//Construtor
public Usuario(String nome, String email, String senha, int tipo){
this.nome = nome;
this.email = email;
this.senha = senha;
this.tipo = tipo;
}

//Métodos de acesso
public String getNome(){ 
return nome;
}
public String getEmail(){ 
return email;
}
public String getSenha(){ 
return nome;
}

}
