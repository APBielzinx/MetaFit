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
        return senha;
    }
    public int getTipo(){
        return tipo;
    }


    // Métodos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    //metodo getDados
    public String getDados() {
        return "Nome: " + nome + "Email: " + email + "Senha: " + senha + "Tipo:" + tipo;

    }

}
