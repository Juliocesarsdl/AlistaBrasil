package org.alistabrasil.controller;

import java.util.List;

import org.alistabrasil.models.Usuario;
import org.alistabrasil.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/cadastro")
    public Usuario cadastrar(@RequestBody Usuario usuario){
        return service.cadastrarUsuario(usuario);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario){
        return service.login(usuario.getCpf(), usuario.getSenha());
    }

    @GetMapping
    public List<Usuario> listar(){
        return service.listarUsuarios();
    }
}
