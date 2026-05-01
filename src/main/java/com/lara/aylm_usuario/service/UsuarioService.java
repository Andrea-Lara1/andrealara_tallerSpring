package com.lara.aylm_usuario.service;

import com.lara.aylm_usuario.model.Usuario;
import com.lara.aylm_usuario.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public void guardar(Usuario u){
        repo.save(u);
    }

    public List<Usuario> listar(){
        return repo.findAll();
    }

    public void eliminar(Long id){
        repo.delete(id);
    }
}
