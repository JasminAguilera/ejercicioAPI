package com.example.ejercicioapig5.services;

import com.example.ejercicioapig5.models.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> listaDeUsuarios();

    Usuario guardarUsuario(Usuario usuarioNuevo);

    void borrarUsuario(Long id);

    Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado);
}