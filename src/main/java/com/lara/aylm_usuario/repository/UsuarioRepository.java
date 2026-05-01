package com.lara.aylm_usuario.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lara.aylm_usuario.model.Usuario;

@Repository
public class UsuarioRepository {

    private List<Usuario> database = new ArrayList<>();

    public List<Usuario> findAll(){
        return database;
    }

    public void save(Usuario u){
        database.add(u);
    }

    public void delete(Long id){
        database.removeIf(u -> u.getId().equals(id));
    }
}