package com.example.ejercicioapig5.services;

import com.example.ejercicioapig5.models.Tarea;
import com.example.ejercicioapig5.models.Usuario;

import java.util.List;

public interface TareaService {
    List<Tarea> listaDeTareas();

    Tarea guardarTarea(Tarea tareaNueva);

    void borrarTarea(Long id);

    Tarea editarTareaPorId(Long id, Tarea tareaActualizada);

}