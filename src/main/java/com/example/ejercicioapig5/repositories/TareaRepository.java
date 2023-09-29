package com.example.ejercicioapig5.repositories;

import com.example.ejercicioapig5.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
}

