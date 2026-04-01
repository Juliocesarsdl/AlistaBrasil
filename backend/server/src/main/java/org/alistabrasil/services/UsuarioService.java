package org.alistabrasil.services;

import java.util.ArrayList;
import java.util.List;

import org.alistabrasil.models.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public Usuario cadastrarUsuario(Usuario usuario) {

        for (Usuario user : usuarios) {
            if (user.getCpf().equals(usuario.getCpf())) {
                throw new RuntimeException("Usuário já existe!");
            }
        }

        usuarios.add(usuario);

        return usuario;
    }

    public Usuario login(String cpf, String senha) {

        for (Usuario user : usuarios) {
            if (user.getCpf().equals(cpf) && user.getSenha().equals(senha)) {
                return user;
            }
        }

        throw new RuntimeException("CPF ou senha inválidos!");
    }

    public Usuario buscaPorCpf(String cpf) {
        
        for (Usuario user : usuarios) {
            if (user.getCpf().equals(cpf)) {
                return user;
            }
        }

        throw new RuntimeException("Usuário não encontrado.");
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

}
