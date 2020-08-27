package com.morebread.api.morebread.controller;
import com.morebread.api.morebread.model.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class usuariosController {

  @GetMapping(path = "/usuarios")
  public List<Usuario> getUsuarios() {
    List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    Usuario user1 = new Usuario();
    user1.setNome("negson");

    Usuario user2 = new Usuario();
    user2.setNome("gyza");

    listaUsuarios.add(user1);
    listaUsuarios.add(user2);

    return listaUsuarios;
  }
}