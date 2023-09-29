package com.example.ejercicioapig5.controllers;

import com.example.ejercicioapig5.models.Comentario;
import com.example.ejercicioapig5.models.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ejercicioapig5.services.ComentarioServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/comentario")
public class ComentarioRestController {

    @Autowired
    ComentarioServiceImpl comentarioService;

    @PostMapping("/comentarioGuardar")
    public Comentario guardarNuevaComentario(@RequestBody Comentario comentarioNuevo){
        Comentario comentarioGuardar = comentarioService.guardarComentario(comentarioNuevo);
        return comentarioGuardar;
    }
    @GetMapping(value = "/comentarioEnlistar")
    public List<Comentario> listaComentario(){
        List<Comentario> listaMostrar = comentarioService.listaDeComentarios();

        return listaMostrar;
    }
    @PutMapping("/actualizar/{id}")
    public Comentario editarComentario(@RequestBody Comentario comentarioActualizada, @PathVariable Long id){
        Comentario comentarioEditado = comentarioService.editarComentarioPorId(id, comentarioActualizada);
        return comentarioEditado;
    }
    @DeleteMapping ("/borrar")
    public String borrarComentario(@RequestParam Long id) {
        comentarioService.borrarComentario(id);
        return "El comentario fue borrado";
    }
}