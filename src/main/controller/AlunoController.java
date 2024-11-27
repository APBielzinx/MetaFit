package main.controller;

import main.dao.AlunoDao;
import main.dao.UsuarioDao;
import main.model.Aluno;

public class AlunoController {

    Validador validador = new Validador();
    AlunoDao alunoDao = new AlunoDao();
    UsuarioDao usuarioDao = new UsuarioDao();

    public void cadastrarAluno(Aluno aluno) {

       if (validador.validarAluno(aluno)){
       String idUsuario = usuarioDao.cadastrarUsuario(aluno.getNome(), aluno.getEmail(), aluno.getSenha(), aluno.getTipo());
       alunoDao.cadastrarAluno(idUsuario, aluno.getIdade(), aluno.getPeso(), aluno.getGenero(), aluno.getPesoMeta());
           System.out.println(buscarAluno(idUsuario).toString());
       }

    }

    public Aluno buscarAluno(String id){
        if (id != null && !id.isEmpty()){
          return alunoDao.buscarAluno(id);
        }else {
            throw new IllegalArgumentException("id invalido!");
        }
    }

    public void atualizarAluno(Aluno aluno){
        if (validador.validarAluno(aluno)){
            usuarioDao.atualizarUsuario(aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getSenha(), aluno.getTipo());
            alunoDao.atualizarAluno(aluno.getId(), aluno.getIdade(), aluno.getPeso(), aluno.getGenero(), aluno.getPesoMeta());
        }
    }

    public void excluirAluno(String id){
        if (id != null && !id.isEmpty()){
            alunoDao.deletarAluno(id);
            usuarioDao.deletarUsuario(id);
        }
    }


}
