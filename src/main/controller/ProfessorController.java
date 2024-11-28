package main.controller;

import main.controller.utils.Validador;
import main.dao.ProfessorDao;
import main.dao.UsuarioDao;
import main.model.Professor;

public class ProfessorController
{
    Validador validador = new Validador();
    ProfessorDao professorDao = new ProfessorDao();
    UsuarioDao usuarioDao = new UsuarioDao();

    public void cadastrarProfesssor(Professor professor)
    {
        if(validador.validarProfessor(professor))
        {
            String idUsuario = usuarioDao.cadastrarUsuario(professor.getNome(), professor.getEmail(),
            professor.getSenha(), professor.getTipo());
            professorDao.cadastrarProfesssor(idUsuario, professor.getEspecialidades());
            professorDao.buscarProfessor(idUsuario).toString();
        }
    }

    public Professor buscaProfessor(String id)
    {
        if(id != null && !id.isEmpty())
        {
            return professorDao.buscarProfessor(id);
        }
        else
        {
            throw new IllegalArgumentException("Id inválido");
        }
    }

    public void atualizarProfessor(Professor professor)
    {
        if(validador.validarProfessor(professor))
        {
            usuarioDao.atualizarUsuario(professor.getId(), professor.getNome(), professor.getEmail(),
            professor.getSenha(), professor.getTipo());
            professorDao.atualizarProfessor(professor.getId(), professor.getNome(), professor.getEmail(),
            professor.getSenha(),professor.getEspecialidades());
        }
    }

    public void excluirProfessor(String id)
    {
        if(id != null && !id.isEmpty())
        {
            professorDao.excluirProfessor(id);
            usuarioDao.excluirUsuario(id);
        }
    }
}