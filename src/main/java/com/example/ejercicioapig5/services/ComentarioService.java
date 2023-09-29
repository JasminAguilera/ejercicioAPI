package com.example.ejercicioapig5.services;

import com.example.ejercicioapig5.models.Comentario;
import com.example.ejercicioapig5.models.Usuario;

import java.util.List;

public interface ComentarioService {
    List<Comentario> listaDeComentarios();

    Comentario guardarComentario(Comentario comentarioNuevo);

    void borrarComentario(Long id);

    Comentario editarComentarioPorId(Long id, Comentario comentarioActualizado);
}
