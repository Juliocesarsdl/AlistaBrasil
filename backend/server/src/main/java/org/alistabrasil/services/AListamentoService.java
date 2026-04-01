package org.alistabrasil.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.alistabrasil.models.Alistamento;
import org.alistabrasil.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AListamentoService {

     private List<Alistamento> alistamentos = new ArrayList<>();

     @Autowired
     private UsuarioService servico;

     public Alistamento realizarAlistamento(Usuario usuario) {

          if (servico.buscaPorCpf(usuario.getCpf()) != null) {

               Alistamento alistado = new Alistamento(usuario.getCpf(), LocalDate.now(), usuario);

               alistamentos.add(alistado);

               return alistado;

          } else {

               System.out.println("Usuário não encontrado. Realize o cadastro.");

               return null;

          }

     }

     public List<Alistamento> listarAlistamentos(){
          return alistamentos;
     }

     
}


