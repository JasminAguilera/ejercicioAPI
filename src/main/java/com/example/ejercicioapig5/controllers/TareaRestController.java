package com.example.ejercicioapig5.controllers;

import com.example.ejercicioapig5.models.Tarea;
import com.example.ejercicioapig5.services.TareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaRestController {

    @Autowired
    TareaServiceImpl tareaService;
    @PostMapping("/tareaGuardar")
    public Tarea guardarNuevaTarea(@RequestBody Tarea tareaNueva){
        Tarea tareaGuardar = tareaService.guardarTarea(tareaNueva);
        return tareaGuardar;
    }
    @GetMapping(value = "/tareaEnlistar")
    public List<Tarea> listaTareas(){
        List<Tarea> listaMostrar = tareaService.listaDeTareas();

        return listaMostrar;
    }
    @PutMapping("/actualizar/{id}")
    public Tarea editarTarea(@RequestBody Tarea tareaActualizada,@PathVariable Long id){

        Tarea tareaEditada = tareaService.editarTareaPorId(id,tareaActualizada);
        return tareaEditada;
    }
    @DeleteMapping ("/borrar")
    public String borrarTarea(@RequestParam Long id) {
        tareaService.borrarTarea(id);
        return "La tarea fue borrada";
    }
}
