package com.example.ejercicioapig5.services;

import com.example.ejercicioapig5.models.Comentario;
import com.example.ejercicioapig5.repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ComentarioServiceImpl implements ComentarioService {

    @Autowired
    ComentarioRepository comentarioRepository;

    @Override
    public List<Comentario> listaDeComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public Comentario guardarComentario(Comentario comentarioNuevo) {
        return comentarioRepository.save(comentarioNuevo);
    }

    @Override
    public void borrarComentario(Long id) {
        comentarioRepository.deleteById(id);
    }

    @Override
    public Comentario editarComentarioPorId(Long id, Comentario comentarioActualizado) {
        Boolean existe = comentarioRepository.existsById(id);
        if (existe) {
            Comentario comentarioSelecionado = comentarioRepository.findById(id).get();
            comentarioSelecionado.setComentarioTexto(comentarioActualizado.getComentarioTexto());
            comentarioSelecionado.setComentarioFecha(comentarioActualizado.getComentarioFecha());
            return comentarioRepository.save(comentarioSelecionado);
        } else {
            System.out.println("El comentario no existe o el ID es incorrecto");
            return null;
        }
    }
}
