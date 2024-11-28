package main.controller;

import main.controller.utils.CriptografarSenha;
import main.controller.utils.Validador;
import main.dao.AlunoDao;
import main.dao.UsuarioDao;
import main.model.Aluno;

import javax.swing.*;

public class AlunoController implements UsuarioController{

    Validador validador = new Validador();
    AlunoDao alunoDao = new AlunoDao();
    UsuarioDao usuarioDao = new UsuarioDao();


    @Override
    public void cadastrar(Object o) {
            if (o instanceof Aluno aluno){
                String senhaCriptografada = CriptografarSenha.criptografarSenha(aluno.getSenha());
                String idUsuario = usuarioDao.cadastrarUsuario(aluno.getNome(), aluno.getEmail(),senhaCriptografada, aluno.getTipo());
                alunoDao.cadastrarAluno(idUsuario, aluno.getIdade(), aluno.getPeso(), aluno.getGenero(), aluno.getPesoMeta());
                System.out.println(buscar(idUsuario).toString());
            }

        }
    @Override
    public Aluno buscar(String id) {
        if (id != null && !id.isEmpty()){
            return alunoDao.buscarAluno(id);
        }else {
            throw new IllegalArgumentException("id invalido!");
        }
    }

    @Override
    public void atualizar(Object o) {
        if (o instanceof Aluno aluno){
            if (validador.validarAluno(aluno)){
                usuarioDao.atualizarUsuario(aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getSenha(), aluno.getTipo());
                alunoDao.atualizarAluno(aluno.getId(), aluno.getIdade(), aluno.getPeso(), aluno.getGenero(), aluno.getPesoMeta());
            }
        }
    }

    @Override
    public void excluir(String id) {
        if (id != null && !id.isEmpty()){
            alunoDao.excluirAluno(id);
            usuarioDao.excluirUsuario(id);
        }
    }

    @Override
    public Aluno fazerLogin(String email, String senha) {
    if (usuarioDao.fazerLogin(email,senha).getClass().equals(Aluno.class)){
        //Direcionar para tela home do usuario
        Aluno aluno = (Aluno) usuarioDao.fazerLogin(email,senha);
        JOptionPane.showMessageDialog(null,"Seja bem vindo! "+aluno.getNome());
        return aluno;
    } else {
        return null;
    }
    }

}

