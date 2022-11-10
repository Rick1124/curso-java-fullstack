package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuarios")
    public List <Usuario> getUsuarios(){
        List <Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(235L);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");

        Usuario usuario2 = new Usuario();
        usuario2.setId(365L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gonzales");
        usuario2.setEmail("maria.gon@hotmail.com");
        usuario2.setTelefono("365365365");

        Usuario usuario3 = new Usuario();
        usuario3.setId(425L);
        usuario3.setNombre("Gabriel");
        usuario3.setApellido("Aliaga");
        usuario3.setEmail("alaiga124@hotmail.com");
        usuario3.setTelefono("234234234");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");
        return usuario;
    }

}
