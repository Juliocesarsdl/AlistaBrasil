package org.alistabrasil.controller;

import java.util.List;

import org.alistabrasil.models.Alistamento;
import org.alistabrasil.models.Usuario;
import org.alistabrasil.services.AListamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alistamento")
public class AlistamentoController {


     @Autowired
     private AListamentoService servico;

     @PostMapping("/realizar-alistamento")
     public Alistamento realizarAlistamento(@RequestBody Usuario usuario){
          return servico.realizarAlistamento(usuario);
     }

     @GetMapping("/alistados")
     public List<Alistamento> listarAlistamentos(){
          return servico.listarAlistamentos();
     }
}
