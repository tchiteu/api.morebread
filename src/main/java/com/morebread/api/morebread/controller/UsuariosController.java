package com.morebread.api.morebread.controller;

import com.morebread.api.morebread.model.Usuario;
import com.morebread.api.morebread.model.UsuarioRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuariosController {
  private UsuarioRepository repository;

  public UsuariosController(UsuarioRepository repository) {
    this.repository = repository;
  }

  @GetMapping(path = "/usuarios")
  public List<Usuario> listaUsuarios() {

    return repository.findAll();
  }

  @PostMapping(path = "/usuarios", produces = { "application/json" })
  public Long criaUsuario(Usuario usuario) {
    Usuario retorno = repository.save(usuario);

    return retorno.getId();
  }
}