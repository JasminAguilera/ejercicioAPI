package com.example.ejercicioapig5.services;
// com.example.ejercicioapig5.com.exaple.ejercicioapig5
import com.example.ejercicioapig5.models.Tarea;
import com.example.ejercicioapig5.repositories.TareaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TareaServiceImpl implements TareaService {

    @Autowired
    TareaRepository tareaRepository;

    @Override
    public List<Tarea> listaDeTareas() {

        return tareaRepository.findAll();
    }

    @Override
    public Tarea guardarTarea(Tarea tareaNueva) {
        return tareaRepository.save(tareaNueva);
    }

    @Override
    public void borrarTarea(Long id) {
        tareaRepository.deleteById(id);

    }

    @Override
    public Tarea editarTareaPorId(Long id, Tarea tareaActualizada) {
        boolean existe = tareaRepository.existsById(id);
        if(existe){
            Tarea tarea = tareaRepository.findById(id).get();
            tarea.setTareaTitulo(tareaActualizada.getTareaTitulo());
            tarea.setTareaDescripcion(tareaActualizada.getTareaDescripcion());
            tarea.setTareaFechaDeVencimiento(tareaActualizada.getTareaFechaDeVencimiento());
            return tareaRepository.save(tarea);
        }else{
            System.out.println("El Curso no existe o su id es invalido");
            return null;
        }
    }
    }
