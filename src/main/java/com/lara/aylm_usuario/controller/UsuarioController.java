package com.lara.aylm_usuario.controller;

import com.lara.aylm_usuario.model.Usuario;
import com.lara.aylm_usuario.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public void guardar(@RequestBody Usuario u){
        service.guardar(u);
    }
    
    @PostMapping("/lista")
    public void guardarVarios(@RequestBody List<Usuario> usuarios){
        for(Usuario u : usuarios){
            service.guardar(u);
        }
    }

    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    }

    @DeleteMapping
    public void eliminar(@RequestParam Long id){
        service.eliminar(id);
    }
}